package org.example

fun main() {
    val makeMain= MakeCounts()
    makeMain.operate()

}

fun countsStrike(input: String, answer: String):Int{
    val strs =MakeStrikes()
    return strs.operate(input,answer)
}

fun countsBalls(input: String, answer: String): Int {
    val ball =MakeBalls()
    return ball.operate(input,answer)
}



