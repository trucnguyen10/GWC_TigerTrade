package com.trucnguyen.tigertrade

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.trucnguyen.tigertrade.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var fullNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var phoneNumberEditText: EditText
    private lateinit var genderSpinner: Spinner
    private lateinit var signUpButton: Button
    private lateinit var signInTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        // Initialize UI elements
        fullNameEditText = findViewById(R.id.fullNameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText)
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText)
        genderSpinner = findViewById(R.id.genderSpinner)
        signUpButton = findViewById(R.id.signUpButton)
        signInTextView = findViewById(R.id.signInTextView)

        // Set click listener for the Sign Up button
        signUpButton.setOnClickListener {
            // Handle sign-up logic here
            val fullName = fullNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()
            val phoneNumber = phoneNumberEditText.text.toString()
            val selectedGender = genderSpinner.selectedItem.toString()

            // Perform sign-up validation and user registration here
            // You can add your user registration logic here (e.g., Firebase Authentication)
            // If registration is successful, you can navigate to the next screen
            // Otherwise, display an error message to the user
        }

        // Set click listener for the "Already have an account? Sign In" text
        signInTextView.setOnClickListener {
            // Navigate to the Sign In activity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}