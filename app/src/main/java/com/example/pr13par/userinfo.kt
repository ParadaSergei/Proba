package com.example.pr13par

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class userinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userinfo)
        val namen:TextView = findViewById(R.id.editText)
        val agen:TextView = findViewById(R.id.editText2)
        val companyn:TextView = findViewById(R.id.editText3)
        val main:MainActivity = MainActivity()


    }
}