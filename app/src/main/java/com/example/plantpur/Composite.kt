package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.composite.*

class Composite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.composite)

        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


            }
        }
    }

