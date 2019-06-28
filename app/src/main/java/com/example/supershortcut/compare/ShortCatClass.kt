package com.example.supershortcut.compare


class ShortCatClass {

    fun outPutName(first: String, last: String, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println(fullName)
    }

    fun outPutNameAndScore(first: String, last: String, upperCase: Boolean = false, score: Int) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName score:$score")
    }

    fun outPutNameAndAge(first: String, last: String, age: Int, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName age:$age")
    }

}
