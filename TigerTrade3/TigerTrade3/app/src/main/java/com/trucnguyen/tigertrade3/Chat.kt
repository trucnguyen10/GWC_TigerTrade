package com.trucnguyen.tigertrade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.trucnguyen.tigertrade.R

class ChatClass : AppCompatActivity() {

    private lateinit var sentMessageTextView: TextView
    private lateinit var sentMessageTextView2: TextView
    private lateinit var newMessageEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat)

        // Initialize UI components
        sentMessageTextView = findViewById(R.id.sentMessage)
        sentMessageTextView2 = findViewById(R.id.sentMessage2)
        newMessageEditText = findViewById(R.id.newMessage)
        sendButton = findViewById(R.id.sendButton)

        // Set a click listener on the send button
        sendButton.setOnClickListener {
            // Get the message from the EditText
            val message = newMessageEditText.text.toString()

            // Do something with the message, like displaying it in the TextView
            sentMessageTextView2.text = "\n               " + message

            // Clear the EditText after sending
            newMessageEditText.text.clear()
        }
    }
}
