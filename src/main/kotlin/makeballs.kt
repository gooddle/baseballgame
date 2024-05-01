package org.example

class MakeBalls(){
    fun operate(input:String,answer : String):Int{
        var balls = 0
        for (i in input.indices) {
            if (input[i] != answer[i] && input[i] in answer) {
                balls++
            }
        }
        return balls
    }
}