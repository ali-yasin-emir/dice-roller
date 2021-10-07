package com.example.dice_roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.roll)
        var showNumber: TextView = findViewById(R.id.textView)
        var showDice: ImageView = findViewById(R.id.imageView)

        showDice.setImageResource(R.drawable.dice_1)

        rollButton.setOnClickListener {

    var rastgele = (1..6).random()
    showNumber.text = rastgele.toString()

when(rastgele){

    1-> showDice.setImageResource(R.drawable.dice_1)
    2-> showDice.setImageResource(R.drawable.dice_2)
    3-> showDice.setImageResource(R.drawable.dice_3)
    4-> showDice.setImageResource(R.drawable.dice_4)
    5-> showDice.setImageResource(R.drawable.dice_5)
    6-> showDice.setImageResource(R.drawable.dice_6)

}



}


    }
}


