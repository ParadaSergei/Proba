package com.example.peredacha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val argument : Bundle? = intent.extras
        val emailText : EditText = findViewById(R.id.emailEditText)
        val nameText : EditText = findViewById(R.id.nameEditText)
        val ageText : EditText = findViewById(R.id.ageEditText)
        if (argument != null) {
            emailText.setText(argument.get("email").toString())
            nameText.setText(argument.get("name").toString())
            ageText.setText(argument.get("age").toString())
        }
    }
    fun transition1(view: View) {
        val emailText : EditText = findViewById(R.id.emailEditText)
        val nameText : EditText = findViewById(R.id.nameEditText)
        val ageText : EditText = findViewById(R.id.ageEditText)
        val intent : Intent = Intent(this@MainActivity, main_redit::class.java)
        if(emailText.text.isNotEmpty() && nameText.text.isNotEmpty() && ageText.text.isNotEmpty())
        {
            intent.putExtra("email", emailText.text.toString())
            intent.putExtra("name", nameText.text.toString())
            intent.putExtra("age", ageText.text.toString())
            startActivity(intent)
        }
        else {
            val toast:Toast = Toast.makeText(applicationContext, "Одно или несколько полей пустые!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}