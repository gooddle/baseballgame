package org.example



class MakeShow() {
    fun operate(resultMaps:MutableMap<Int,Int>){
        if(resultMaps.isEmpty()){
            println("기록이 없습니다.")
        }

        for((key,value ) in resultMaps){
            println("게임 판수 :${key},시도 횟수:${value}")
        }
    }

}