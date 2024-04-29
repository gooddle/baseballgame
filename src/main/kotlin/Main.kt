package org.example
fun main() {
    val inresult = game()
    while (true) {
        println("게임 시작")
        val input = readln()
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
            println("게임 종료")
            break
        }


    }

}


fun game(): String {
    val answer = (100.. 999).toList().toMutableList()
    val result =mutableListOf<Int>()
    for(i in answer.indices){
       if(answer[i].toString().contains("0")||answer[i].toString().toSet().size !=3){}
    }
    answer -= result.toSet()
    return answer.random().toString()
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