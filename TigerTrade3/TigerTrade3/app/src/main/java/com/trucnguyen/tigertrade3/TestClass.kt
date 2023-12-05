package com.trucnguyen.tigertrade

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.*
import com.trucnguyen.tigertrade.R

class TestClass : AppCompatActivity() {

    private lateinit var tradeButton1: Button
    private lateinit var tradeButton2: Button
    private lateinit var tradeButton3: Button
    private lateinit var tradeButton4: Button
    private lateinit var tradeButton5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test) // Replace with your layout file name

        tradeButton1 = findViewById(R.id.tradeButton1)
        tradeButton2 = findViewById(R.id.tradeButton2)
        tradeButton3 = findViewById(R.id.tradeButton3)
        tradeButton4 = findViewById(R.id.tradeButton4)
        tradeButton5 = findViewById(R.id.tradeButton5)

        tradeButton1.setOnClickListener {
            val intent1 = Intent(this, ChatClass::class.java)
            startActivity(intent1)
        }
        tradeButton2.setOnClickListener {
            val intent2 = Intent(this, ChatClass::class.java)
            startActivity(intent2)
        }
        tradeButton3.setOnClickListener {
            val intent3 = Intent(this, ChatClass::class.java)
            startActivity(intent3)
        }
        tradeButton4.setOnClickListener {
            val intent4 = Intent(this, ChatClass::class.java)
            startActivity(intent4)
        }

    }
}
