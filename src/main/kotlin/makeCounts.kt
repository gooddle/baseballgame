package org.example

class MakeCounts {
    fun operate() {
        var gameCount = 0

        while (true) {
            println("1.게임시작 , 2.전적보기 , 3.게임종료")
            val start = readLine()?.toIntOrNull() ?: continue
            when (start) {
                1 -> {
                    gameCount++
                    var inputCount = 0
                    val answer = (0..9).shuffled().take(3)
                    val number = answer.joinToString("")
                    if (answer[0] == 0) {
                        answer.shuffled().take(3)
                    }
                    println(number)

                    val scoreResult = number
                    while (true) {
                        println("게임 시작")
                        val input = readln()
                        inputCount++
                        when (input.length) {
                            3 -> {
                                if (input.toSet().size != 3) {
                                    println("동일한 숫자 사용해주세요")
                                    continue
                                } else if (!input.all { it.isDigit() }) {
                                    println("숫자 사용")
                                    continue
                                } else if (input[0] == '0') {
                                    println("0은 사용 불가입니다.")
                                }
                            }

                            else -> continue

                        }
                        val strikes = countsStrike(input, scoreResult)
                        val balls = countsBalls(input, scoreResult)

                        println("스트라이크:${strikes} ,볼:${balls} ")
                        if (strikes == 3) {
                            resultGame(inputCount.toString(), gameCount)
                            println("${inputCount}")
                            println("게임 종료")
                            break
                        }


                    }

                }

                2 -> {
                    println("기록보기")
                    println("-----------------------------------")
                    show()
                    println("-----------------------------------")
                    continue
                }

                3 -> {
                    println("게임종료")
                    break
                }

                else -> throw error("1,2,3 메뉴중에 고르세요")
            }

        }
    }
}