package com.example.supershortcut.refactor


@Suppress("SameParameterValue")
class RefactorClass {

    //  Combining same code into one function
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










    // Moving classes


    val parent = Parent()
    val child = Child()

    class Child {
        // TODO:
    }

    class Parent {
        // TODO:
    }















    // Modifying Sort order
    private fun secondFunction(
        argument3: Int,
        argument1: String,
        argument2: Int,
        argument4: Long
    ) {
        println(argument3)
        println(argument1)
        println(argument2)
        println(argument4)
    }

    // comment
    fun firstFunction() {
        secondFunction(3, "1", 2, 4L)
    }







    enum class NAME {
        ABEL,
        ABRAHAM,
        ACHIM,
        ADALBERT,
        ADALBRECHT,
        ADAM,
        ADELBERT,
        ADOLF,
        ADRIAN,
        ALBAN,
        ALBERT,
        ALBRECHT,
        ALEXANDER,
        ALEXIS,
        ALFONS,
    }













}
