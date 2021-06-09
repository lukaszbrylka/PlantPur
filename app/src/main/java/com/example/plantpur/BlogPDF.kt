package com.example.plantpur

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdfview.PDFView
import kotlinx.android.synthetic.main.composite.*


class BlogPDF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.blogpdf)

        findViewById<PDFView>(R.id.pdfview).fromAsset("blog.pdf").show()


        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

