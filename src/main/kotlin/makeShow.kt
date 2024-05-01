package org.example

val resultMap = mutableMapOf<Int, String>()

class MakeShow {

    fun operate(gameCount:Int,inputCounts: String){
        resultMap[gameCount] = inputCounts
        println("게임 판수:${gameCount},시도 횟수:${inputCounts}")
    }


    fun operate(){
        if(resultMap.isEmpty()){
            println("기록이 없습니다.")
        }

        for((key,value ) in resultMap){
            println("게임 판수 :${key},시도 횟수:${value}")
        }
    }

}