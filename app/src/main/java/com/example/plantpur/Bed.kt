package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.composite.*

class Bed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bed)

        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}