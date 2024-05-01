package org.example

class MakeStrikes() {
    fun operate(input:String,answer : String):Int{
        var strikes = 0
        for (i in input.indices) {
            if (input[i] == answer[i]) {
                strikes++
            }

        }
        return strikes
    }
}