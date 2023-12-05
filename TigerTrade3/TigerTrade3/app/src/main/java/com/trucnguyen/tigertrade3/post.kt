package com.trucnguyen.tigertrade

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class Post : AppCompatActivity() {

    private lateinit var productName: EditText
    private lateinit var wantedPrice: EditText
    private lateinit var productImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post)

        // Initialize views
        productName = findViewById(R.id.productName)
        wantedPrice = findViewById(R.id.wantedPrice)
        productImage = findViewById(R.id.productImage)
    }

    // Called when the 'Upload Photo' button is clicked
    fun onUploadButtonClick(view: View) {
        // Intent to open gallery or camera to pick image
        // Example: Open gallery
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    // Called when the 'Trade' button is clicked
    fun onTradeButtonClick(view: View) {
        // Handle the trade logic here
        // Example: Grab the text from productName and wantedPrice
        val name = productName.text.toString()
        val price = wantedPrice.text.toString()

        Toast.makeText(this, "Item successfully uploaded for verification", Toast.LENGTH_LONG).show()

        productName.setText("")
        wantedPrice.setText("")
        productImage.setImageResource(0)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            // Handle the image picked from gallery
            val imageUri = data?.data
            productImage.setImageURI(imageUri)
        }
    }

    companion object {
        private const val IMAGE_PICK_CODE = 1000
    }
}