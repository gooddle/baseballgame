package org.example




fun main() {
    var inresult = game()
    while (true) {
        println("게임 시작")
        val input = readln()!!.toString()
        when(input.length){
            3 ->{if(input[0] == input[1] || input[0] == input[2] || input[1] == input[2]){
                println("동일한 숫자 반복 사용 금지")
                continue
            }
            else if(!input.all { it.isDigit() }){
                println("숫자 사용")
                continue
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
    var answer = (100.. 999).toList()
    val result =mutableListOf<Int>()
    for(i in answer.indices){
        if(answer[i].toString().contains("0")){
            result.add(i)
        }else if(answer[0]==answer[1]||answer[0]==answer[2]||answer[1]==answer[2]){
            result.add(i)
        }
    }
    answer -= result
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