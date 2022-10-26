package com.example.pr13

import android.app.ProgressDialog.show
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast.makeText
import java.time.Duration

class MainActivity : AppCompatActivity() {
    val editText1:EditText = findViewById(R.id.editText1)
    val editText22:EditText = findViewById(R.id.editText22)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {

        editText1.requestFocus()
    }

    fun konvert(editText1:EditText,editText22:EditText) {
        var summa:Int = editText1-editText22
    }
}



class Toast{
    fun makeText(context: Context, text:String, duration:Int){

    }
}