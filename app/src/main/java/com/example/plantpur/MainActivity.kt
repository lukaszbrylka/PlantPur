package com.example.plantpur

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toolbar = findViewById(R.id.main_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0)
        toggle.syncState()
        drawerLayout.addDrawerListener(toggle)
        navView.setNavigationItemSelectedListener(this)

        fab_btn.setOnClickListener(){
            Toast.makeText(this, "Napisz do nas!",Toast.LENGTH_LONG).show()
            intent = Intent(this,Email::class.java)
            startActivity(intent)
        }

        }


        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {

                R.id.nav_composite -> {
                    Toast.makeText(this, "Materac composite - świetny wybór!", Toast.LENGTH_SHORT)
                        .show()
                    intent = Intent(this, Composite::class.java)
                    startActivity(intent)
                }
                R.id.nav_natural -> {
                    Toast.makeText(this, "Materac natural - świetny wybór!", Toast.LENGTH_SHORT)
                        .show()
                    intent = Intent(this, Natural::class.java)
                    startActivity(intent)
                }
                R.id.nav_life -> {
                    Toast.makeText(this, "Materac life - świetny wybór!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, Life::class.java)
                    startActivity(intent)
                }
                R.id.nav_baby -> {
                    Toast.makeText(this, "Materac baby - świetny wybór!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, Baby::class.java)
                    startActivity(intent)
                }
                R.id.nav_nawierzchniowy -> {
                    Toast.makeText(this, "Materac nawierzchniowy - świetny wybór!",Toast.LENGTH_SHORT).show()
                    intent = Intent(this, Nawierzchniowy::class.java)
                    startActivity(intent)
                }
                R.id.nav_bed -> {
                    Toast.makeText(this, "Nasze łóżka - świetny wybór!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, Bed::class.java)
                    startActivity(intent)
                }
                R.id.nav_sklep -> {
                    Toast.makeText(this, "Przenoszę do sklepu!", Toast.LENGTH_SHORT).show()
                    val url ="https://plantpur.pl/pl/sklep-z-materacami"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                R.id.nav_onas -> {
                    Toast.makeText(this, "O nas!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, O_nas::class.java)
                    startActivity(intent)
                }
                R.id.nav_blog -> {
                    Toast.makeText(this, "Przenoszę do bloga!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, BlogPDF::class.java)
                    startActivity(intent)

                }
                R.id.nav_opinie -> {
                    Toast.makeText(this, "Opinie są dla nas bardzo ważne!", Toast.LENGTH_SHORT).show()
                    val url ="https://plantpur.pl/pl/opinie"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                R.id.nav_pytania -> {
                    Toast.makeText(this, "Najczęstsze pytania!", Toast.LENGTH_SHORT).show()
                    val url ="https://plantpur.pl/pl/pytania"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                R.id.nav_kontakt -> {
                    Toast.makeText(this, "Kontakt!", Toast.LENGTH_SHORT).show()
                    intent = Intent(this, Email::class.java)
                    startActivity(intent)
                }


            }
            drawerLayout.closeDrawer(GravityCompat.START)
            return true
        }
    }




