package com.example.rolldice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollDice: Button = findViewById(R.id.clickme)
        val answer: TextView = findViewById(R.id.answer)
        val myFirstDice = Dice()
        val img: ImageView = findViewById(R.id.img)
        img.setImageResource(R.drawable.dice_6)


        rollDice.setOnClickListener {
            val toast = Toast.makeText(this,"Dice Rolling... ",Toast.LENGTH_SHORT)
            toast.show()
            val dice =  myFirstDice.rol()
            answer.setText("Your Number Is: $dice")

            val image = when(dice){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> {R.drawable.dice_6}
            }
            img.setImageResource(image)
        }
    }

    class Dice{
        fun rol():Int{
            return (1..6).random()
        }
    }
}