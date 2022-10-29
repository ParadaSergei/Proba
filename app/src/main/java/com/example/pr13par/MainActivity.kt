package com.example.pr13par

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ClicktoStore(view: View) {
        val nameText: TextView = findViewById(R.id.editText)
        val ageText: TextView = findViewById(R.id.editText2)
        val companyText: TextView = findViewById(R.id.editText3)
        val name = nameText.text.toString()
        val age = ageText.text.toString()
        val company = companyText.text.toString()
        val intent: Intent = Intent(this@MainActivity,userinfo::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("company", company)
        startActivity(intent)
    }
}