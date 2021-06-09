package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.composite.*

class Baby : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baby)

        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}