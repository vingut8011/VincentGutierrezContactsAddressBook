package com.example.vincentgutierrez_contactsaddressbook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Vincent Gutierrez
// Contacts Address Book
// November 16, 2026

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnAlice = findViewById<android.widget.Button>(R.id.btnAliceDetails)
        btnAlice.setOnClickListener {
            val intent = android.content.Intent(this, AliceActivity::class.java)
            startActivity(intent)
        }

        val btnAndrew = findViewById<android.widget.Button>(R.id.btnAndrewDetails)
        btnAndrew.setOnClickListener {
            val intent = android.content.Intent(this, AndrewActivity::class.java)
            startActivity(intent)
        }
    }
}