package com.example.supershortcut.refactor

import com.example.supershortcut.compare.MouseClass
import com.example.supershortcut.compare.ShortCatClass


fun hoge() {
    val mouseClass = MouseClass()
    mouseClass.outPutNameAndScore("", "", true, 2)
    mouseClass.outPutNameAndAge("", "", 2)
    mouseClass.outPutName("first","last")

    val shortCatClass = ShortCatClass()
    shortCatClass.outPutNameAndScore("", "", true, 2)
    shortCatClass.outPutNameAndAge("", "", 2)
    shortCatClass.outPutName("first","last")

    val opt = OptionEnterClass()
    opt.toSwitch(OptionEnterClass.TYPE.A)
    opt.typoNama
    OptionEnterClass.ManyField("", 1, 1, 1, "", 1, 1, 1, "", 1, 1, 1, "", 1, 1, 1)

    val refactor = RefactorClass()
    refactor.outPutNameAndScore("", "", true, 2)
    refactor.outPutNameAndAge("", "", 2)
    refactor.parent
    refactor.child
    refactor.firstFunction()
    refactor.outPutName("first","last")
}
