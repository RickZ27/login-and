package com.example.assignment

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_user)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.secondLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val welcomeTextView = findViewById<TextView>(R.id.textWelcome)
        val fullNameTextView = findViewById<TextView>(R.id.textFullName)
        val emailTextView = findViewById<TextView>(R.id.textEmail)
        val genderTextView = findViewById<TextView>(R.id.textGender)
        val countryTextView = findViewById<TextView>(R.id.textCountry)
        val cityTextView = findViewById<TextView>(R.id.textCity)

        // Retrieve data passed via Intent
        val fullName = intent.getStringExtra("FULL_NAME")
        val email = intent.getStringExtra("EMAIL")
        val gender = intent.getStringExtra("GENDER")
        val country = intent.getStringExtra("COUNTRY")
        val city = intent.getStringExtra("CITY")

        // Display data in the TextViews
        welcomeTextView.text = "Welcome, $fullName!"
        fullNameTextView.text = "Full Name: $fullName"
        emailTextView.text = "Email: $email"
        genderTextView.text = "Gender: $gender"
        countryTextView.text = "Country: $country"
        cityTextView.text = "City: $city"

    }
}
