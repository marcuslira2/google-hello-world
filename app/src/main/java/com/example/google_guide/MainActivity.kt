package com.example.google_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{rollDice()}

        val countButton: Button = findViewById(R.id.button2)
        countButton.setOnClickListener{countPlusOne()}


    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()


        Toast.makeText(this,"Roll dice clicked", Toast.LENGTH_SHORT).show()
    }
    private fun countPlusOne(){
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "" ){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }

        }

        Toast.makeText(this,"Count up clicked", Toast.LENGTH_SHORT).show()
    }
}