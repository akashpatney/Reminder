package com.example.reminder

import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val add: Button = findViewById(R.id.add_reminder)

        add.setOnClickListener{ addText() }
    }

    private fun addText() {
        // Grab edit remind view
        val message: TextView = findViewById(R.id.edit_remind)

        // Store reminder input in reminder variable
        val reminder: String = message.text.toString()


        // Create new text view object
        // Set text view text to reminder message
        val textView = TextView(this)
        textView.setText(reminder)


        // Add the text view to the linear layout
        val layout: LinearLayout = findViewById(R.id.myLinearLayout)
        layout.addView(textView)

        // priority string
        val priority: String = reminder + " (priority)"

        textView.setOnClickListener{ textView.setText(priority)}

        // Clear the edit reminder text
        message.text = ""


    }
}