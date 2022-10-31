package com.example.pr14par

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract

class userinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userinfo)
        val arguments: Bundle? = intent.extras
        val names: TextView = findViewById(R.id.editTextNameInfo)
        val ages: TextView = findViewById(R.id.editTextAgeInfo)
        val companys: TextView = findViewById(R.id.editTextCompanyInfo)
        val main = MainActivity()
        if (arguments != null)
        {
            val name:String = arguments.get("name").toString()
            val company:String? = arguments.getString("company")
            val age:Int? = arguments.getInt("age")
        }
    }
    fun ClicktoStore(view: View)
    {
        val nameText: TextView = findViewById(R.id.editTextNameInfo)
        val ageText: TextView = findViewById(R.id.editTextAgeInfo)
        val companyText: TextView = findViewById(R.id.editTextCompanyInfo)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val company =companyText.text.toString()
        val intent:Intent = Intent(this@userinfo,MainActivity::class.java)
        intent.putExtra("name",name)
        intent.putExtra("age",age)
        intent.putExtra("company",company)

    }
}