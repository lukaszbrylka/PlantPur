package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.composite.*

class Nawierzchniowy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nawierzchniowy)

        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }
}