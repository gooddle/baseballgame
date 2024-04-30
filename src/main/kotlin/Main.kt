package org.example

fun main() {
    val inresult = game()
    var gameCount =0
    var inputCount = 0
 while (true) {
     println("1.게임시작 , 2.전적보기 , 3.게임종료")
     val start = readLine()?.toIntOrNull() ?: continue
     when(start){
         1-> {
             gameCount++
             inputCount = 0

             while (true) {
                 println("게임 시작")
                 val input = readln()
                 inputCount ++
                 when(input.length){
                     3 ->{if(input.toSet().size !=3){
                         println("동일한 숫자 사용해주세요")
                         continue
                     }
                     else if(!input.all { it.isDigit() }){
                         println("숫자 사용")
                         continue
                     }else if("0" in input){
                         println("0은 사용 불가입니다.")
                     }
                     }

                     else ->  continue

                 }
                 val strikes= countsStrike (input,inresult)
                 val balls= countsBalls(input,inresult)

                 println("스트라이크:${strikes} ,볼:${balls} ")
                 if(strikes == 3){
                     resultGame(inputCount.toString(),gameCount)
                     println("${inputCount}")
                     println("게임 종료")
                     break
                 }


             }

         }
         2-> {
             println("기록보기")
             show()
             continue
         }
         3->{
             println("게임종료")
             break
         }
         else -> throw error("1,2,3 메뉴중에 고르세요")
     }

 }}



fun game(): String {
    val answer = (1..9).shuffled().take(3)
    val number = answer.joinToString("")
    println(number)
    return number
}

fun countsStrike(input: String, answer: String): Int {
    var strikes = 0
    for (i in input.indices) {
        if (input[i] == answer[i]) {
            strikes++
        }
    }
    return strikes
}

fun countsBalls(input: String, answer: String): Int {
    var balls = 0
    for (i in input.indices) {
        if (input[i] != answer[i] && input[i] in answer) {
            balls++
        }
    }
    return balls
}


val resultMap = mutableMapOf<Int, String>()
fun resultGame(input: String,gameCount: Int){
     resultMap[gameCount] = input
        println("게임 판수:${gameCount},시도 횟수:${input}")
    }

fun show(){
    if(resultMap.isEmpty()){
        println("기록이 없습니다.")
    }

    for((key,value ) in resultMap){
        println("게임 판수 :${key},시도 횟수:${value}")
    }
}
