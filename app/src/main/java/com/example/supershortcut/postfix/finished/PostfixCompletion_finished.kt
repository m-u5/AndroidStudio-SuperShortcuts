package com.example.supershortcut.postfix.finished

fun prefixCompletion_finished() : Unit {
    // val
    // true.val
    val b1 = true
    // null.var
    var nothing = null

    // b1.listOf.arrayOf.for
    return try {
        for (list in arrayOf(listOf(b1))) {
            // list.iter
            for (b in list) {
                // b.sout
                println(b)

                // nothing.null.not
                if (nothing != null) {

                }

                // nothing.notnull
                if (nothing != null) {

                }
                // nothing.nn
                if (nothing != null) {

                }

                // b.if
                if (b) {

                }
                // b.else
                if (!b) {

                }

                // b.while
                while (b) {
                    // b.when
                    when (b) {
                        true -> {
                        }
                        else -> {
                        }
                    }
                }
                // b.par
                (b)
            }
        }
    } catch (e: Exception) { // .try
    } // .return
}
