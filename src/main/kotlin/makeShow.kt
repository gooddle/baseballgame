package org.example

class MakeShow {

    fun operate(){
        if(resultMap.isEmpty()){
            println("기록이 없습니다.")
        }

        for((key,value ) in resultMap){
            println("게임 판수 :${key},시도 횟수:${value}")
        }
    }

}