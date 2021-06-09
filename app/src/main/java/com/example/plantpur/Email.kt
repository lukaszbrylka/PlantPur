package com.example.plantpur

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.plantpur.databinding.EmailBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.composite.*
import kotlinx.android.synthetic.main.email.*
import kotlinx.android.synthetic.main.nav_header.*
import kotlinx.android.synthetic.main.nav_header.back_button
import java.lang.Exception
import javax.security.auth.Subject

class Email : AppCompatActivity(), OnMapReadyCallback {

    lateinit var binding: EmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EmailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sendEmailBtn.setOnClickListener {



            val subject = binding.editText2.text.toString()
            val message = binding.editText3.text.toString()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data= Uri.parse ("mailto: plantpur@kontakt.pl")
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, message)

            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this@Email, "Wysyłanie nie powiodło się", Toast.LENGTH_SHORT).show()
            }

            val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
            mapFragment?.getMapAsync(this)

        }
        back_button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        }
    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(51.251200, 17.362280))
                .title("Marker")

        )
    }
}









