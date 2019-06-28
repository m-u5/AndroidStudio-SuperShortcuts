package com.example.supershortcut.activity.finished

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.supershortcut.R
import kotlinx.android.synthetic.main.activity_main_finished.*

class MainActivityFinished : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_finished)

        button_finished.setOnLongClickListener { p0 ->
            (p0 as Button).text = getString(R.string.finished)
            true
        }
    }
}
