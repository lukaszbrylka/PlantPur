package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_login.*
import kotlin.system.exitProcess

class LoginActivity : AppCompatActivity() {

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login = findViewById<Button>(R.id.next_button)


        btn_login.setOnClickListener {

            if(login_edit_text.text.toString()=="user" && password_edit_text.text.toString() == "pass")
            {
                Toast.makeText(this@LoginActivity, "Witaj w świecie materacy!", Toast.LENGTH_SHORT).show()
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}
            else Toast.makeText(this@LoginActivity, "Niepoprawne dane!", Toast.LENGTH_LONG).show()
        }

        val cancel_button: Button = findViewById(R.id.cancel_button)
        cancel_button.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Do zobaczenia !",Toast.LENGTH_LONG).show()
            finish()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        exitProcess(0)
    }
}
