package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var diceRollButton: Button
    lateinit var diceResult: TextView

    val randomLetters = listOf("A", "B", "C", "D", "E", "F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceRollButton = findViewById(R.id.roll_button)
        diceResult = findViewById(R.id.result_text)

        diceRollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomLetter = randomLetters.random()
        diceResult.text = randomLetter

        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}