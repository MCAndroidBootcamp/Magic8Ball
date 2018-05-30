package com.mcandroid.magic8ball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    var randomNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        assignRandomNumber()
        generateresponse()
    }

    fun generateresponse(){
        btnAsk.setOnClickListener{


            var response = "Default Response"

            // complete the when to include each possible response
            // for each possible randomly generated value
            when (randomNum) {
                1 -> response = "Response 1"
                2 -> response = "Response 2"
                3 -> response = "Response 3"
                else -> { // Note the block
                    response = "Default Response"
                }
            }

            lblResponse.text = response
        }
    }

    fun generateRandomNumber(): Int{
        var random = Random()
        var min = 1
        var max = 20
        randomNum = random.nextInt(max + 1 - min) + min

        return randomNum
    }

    fun assignRandomNumber(){
        randomNum = generateRandomNumber()
    }
}
