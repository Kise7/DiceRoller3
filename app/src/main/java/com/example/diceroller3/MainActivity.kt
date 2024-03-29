package com.example.diceroller3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        //lateinit var diceImage1 : ImageView
        //lateinit var diceImage2 : ImageView
        //lateinit var diceImage3 : ImageView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //diceImage = findViewById(R.id.dice_image)


        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)



    }


    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        //diceImage = findViewById(R.id.dice_image)



        //val diceImage1: ImageView = findViewById(R.id.dice_image1)
        //val diceImage2: ImageView = findViewById(R.id.dice_image2)
        //val diceImage3: ImageView = findViewById(R.id.dice_image3)

        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResource3 = when (randomInt3) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)

        // val resultText3: TextView = findViewById(R.id.result_text3)
        //resultText3.text = randomInt3.toString()
    }

}
