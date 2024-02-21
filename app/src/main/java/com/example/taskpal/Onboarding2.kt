package com.example.taskpal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding3_layout)

        val skip: Button = findViewById(R.id.skip)

        skip.setOnClickListener {
            Intent(this@Onboarding2, AccountCreate::class.java).also { startActivity(it) }
        }

        val Continue: Button = findViewById(R.id.Continue)

        Continue.setOnClickListener {
            Intent(this@Onboarding2, AccountCreate::class.java).also { startActivity(it) }
        }
    }
}
