package com.netcompany.tormah.howtomakelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*private lateinit var textView: TextView*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*textView = findViewById(R.id.textView_main_helloWorld)*/

        button_main_updateHelloWorld.setOnClickListener{
            textView_main_helloWorld.text = editText_main_updateHelloWorld.text
        }

    }
}
