package ru.mggtk.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Intent: Intent = Intent(this@MainActivity,
            SecondActivity2::class.java)

        intent.putExtra("hello","hello word")
        startActivity(intent)

        val arguments: Bundle? = intent.extras
        if (arguments != null){
            val name: String = arguments.get("hello").toString()
        }

        fun buttonSecondClick (view: View){
            val nameText: TextView = findViewById(R.id.editTextName)
            val ageText: TextView = findViewById(R.id.editTextAge)
            val companyText: TextView = findViewById(R.id.editTextCompany)

            val name = nameText.text.toString()
            val age = ageText.text.toString().toInt()
            val company = companyText.text.toString()

            val user: User = User(name, company, age)

            val intent: Intent = Intent(this@MainActivity,SecondActivity2::class.java)

            intent.putExtra(user.javaClass.simpleName, user)

            startActivity(intent)

        }
    }
}