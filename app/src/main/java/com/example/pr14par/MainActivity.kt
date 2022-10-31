package com.example.pr14par

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    companion object{
        const val AGE_KEY:String = "AGE"
        const val ACCESS_MESSAGE:String = "ACCESS_MESSAGE"
    }
    var mStartForResult:ActivityResultLauncher<Intent?>?=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        val nameText: TextView = findViewById(R.id.editTextNameMain)
        val ageText: TextView = findViewById(R.id.editTextAgeMain)
        val companyText: TextView = findViewById(R.id.editTextCompanyMain)
        if(result.resultCode== RESULT_OK){
            val intent:Intent?=result.data
            val accessMessage:String?=intent!!.getStringExtra(ACCESS_MESSAGE)
            ageText.text=accessMessage
            nameText.text=accessMessage
            companyText.text=accessMessage
        }
        else{
            ageText.text="Ошибка"
            nameText.text="Ошибка"
            companyText.text="Ошибка"
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ClicktoStore(view: View) {
        val nameText: TextView = findViewById(R.id.editTextNameMain)
        val ageText: TextView = findViewById(R.id.editTextAgeMain)
        val companyText: TextView = findViewById(R.id.editTextCompanyMain)
        val name = nameText.text.toString()
        val age = ageText.text.toString()
        val company = companyText.text.toString()
        val intent: Intent = Intent(this@MainActivity, userinfo::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("company", company)
        mStartForResult?.launch(intent)


    }
}