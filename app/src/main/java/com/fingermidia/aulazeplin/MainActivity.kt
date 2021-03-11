package com.fingermidia.aulazeplin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signup = findViewById<Button>(R.id.signup)
        signup.setOnClickListener {

            var intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}