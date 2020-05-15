package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        val titleLabel: TextView = findViewById(R.id.title_label)
        val randomInt = (1..6).random()
        titleLabel.text = randomInt.toString()
    }

    private fun countUp() {
        val titleLabel: TextView = findViewById(R.id.title_label)
        var title: String = titleLabel.text.toString()
        if (title == "Roll Dice") {
            title = "0"
        }
        if (title == "6") {
            return
        }
        var number: Int = title.toInt()
        number += 1
        titleLabel.text = number.toString()
    }
}
