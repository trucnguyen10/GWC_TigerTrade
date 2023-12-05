package com.trucnguyen.tigertrade

import android.annotation.SuppressLint
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
import android.widget.ImageView
import android.widget.TextView
import com.trucnguyen.tigertrade.R

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileImageView: ImageView
    private lateinit var studentIdTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var creditScoreTextView: TextView
    private lateinit var tradeHistoryTextView: TextView
    private lateinit var bioTextView: TextView
    private lateinit var buyingButton: Button
    private lateinit var sellingButton: Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)

        // Initialize UI elements
        profileImageView = findViewById(R.id.profileImageView)
        studentIdTextView = findViewById(R.id.studentIdTextView)
        emailTextView = findViewById(R.id.emailTextView)
        phoneTextView = findViewById(R.id.phoneTextView)
        creditScoreTextView = findViewById(R.id.creditScoreTextView)
        tradeHistoryTextView = findViewById(R.id.tradeHistoryTextView)
        bioTextView = findViewById(R.id.bioTextView)
        buyingButton = findViewById(R.id.button7)
        sellingButton = findViewById(R.id.button8)


        // Populate TextViews and ImageView with user profile data
        studentIdTextView.text = "Student ID: John12345"
        emailTextView.text = "Email: john@example.com"
        phoneTextView.text = "Phone Number: +1 (123) 456-7890"
        creditScoreTextView.text = "Credit Score: 750"
        tradeHistoryTextView.text = "Trade History:\n- Item 1\n- Item 2\n- Item 3"
        bioTextView.text = "Bio:\nThis is my bio. I love trading and making new connections!"

        buyingButton.setOnClickListener {
            val intent1 = Intent(this, TestClass::class.java)
            startActivity(intent1)
        }
        sellingButton.setOnClickListener {
            val intent = Intent(this, Post::class.java)
            startActivity(intent)
        }
    }
}
