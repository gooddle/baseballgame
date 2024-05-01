package org.example

val resultMap = mutableMapOf<Int, String>()

class MakeMap(){
    fun operate(gameCount:Int,inputCounts: String){
        resultMap[gameCount] = inputCounts
        println("게임 판수:${gameCount},시도 횟수:${inputCounts}")
    }

}