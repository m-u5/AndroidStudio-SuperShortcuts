package com.example.supershortcut.refactor


class OptionEnterClass {

    // Modifying typo
    val typoNama = ""

    // Making a variable private
    val private = ""

    // Removing variable.
    val notUsed = ""


    // "if" to "when"
    fun toSwitch(name: TYPE) {

        if (name == TYPE.A) {
            //no impl
        } else if (name ==TYPE.B) {
            //no impl
        } else if (name ==TYPE.C) {
            //no impl
        }
    }



    fun errorFunction(){
        val returnValue = ""
        return returnValue
    }













    data class ManyField(val first: String, val second: Int, val third: Int, val fourth: Int, val fifth: String, val sixth: Int, val seventh: Int, val eighth: Int, val first2: String, val second2: Int, val third2: Int, val fourth2: Int, val fifth2: String, val sixth2: Int, val seventh2: Int, val eighth2: Int)





















    enum class TYPE {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
    }

    fun references(){
        private
        errorFunction()
    }

}
