package org.example

class MakeCounts() {
    fun operate() {
        var gameCount = 0
        val resultMaps =mutableMapOf<Int,Int>()
        while (true) {
            println("1.게임시작 , 2.전적보기 , 3.게임종료")
            val start = readLine()?.toIntOrNull() ?: continue
            when (start) {
                1 -> {

                    gameCount++
                    var inputCount = 0
                    println("정답은 앞자리가 0이 아닌 서로 다른 3자리수!")

                    var answer = (0..9).shuffled().take(3)
                    while(answer[0] == 0) {
                        answer = (0..9).shuffled().take(3)
                    }
                    val number = answer.joinToString("")


                    println(number)
                    val scoreResult = number

                    while (true) {
                        println("게임 시작")
                        val input = readln()
                        inputCount++
                        when (input.length) {
                            3 -> {
                                if (input.toSet().size != 3) {
                                    println("동일한 숫자 사용 할 수 없습니다.")
                                    continue
                                } else if (!input.all { it.isDigit() }) {
                                    println("숫자 사용")
                                    continue
                                } else if (input[0] == '0') {
                                    println("0은 맨 앞자리 사용 불가입니다.")
                                }
                            }

                            else ->{
                                println("규칙을 지켜주세요!")
                                continue}

                        }
                        val strikes = countsStrike(input, scoreResult)
                        val balls = countsBalls(input, scoreResult)

                        println("스트라이크:${strikes} ,볼:${balls} ")
                        if (strikes == 3) {
                            resultMaps[gameCount]=inputCount
                            println("게임 종료")
                            break
                        }


                    }

                }

                2 -> {
                    println("기록보기")
                    println("-----------------------------------")
                    MakeShow().operate(resultMaps)
                    println("-----------------------------------")
                    continue
                }

                3 -> {
                    println("게임종료")
                    break
                }

                else ->{println("1,2,3 선택 메뉴얼을 지켜주세여")
                    continue
                }

            }

        }
    }
}
