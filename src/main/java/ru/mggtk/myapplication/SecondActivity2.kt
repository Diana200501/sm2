package ru.mggtk.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)


            val textView: TextView = findViewById(R.id.textView)

        var user: User = User()

        val arguments: Bundle? = intent.extras
        if (arguments!= null) {

            user = arguments.getSerializable(user.javaClass.simpleName) as User



            textView.text =
                "Name: ${user.getName()} \nCompany: ${user.getCompany()} \nAge: ${user.getAge()}"




        }
    }
}