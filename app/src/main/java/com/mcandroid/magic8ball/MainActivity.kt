package com.mcandroid.magic8ball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateresponse()
    }

    fun generateresponse(){
        btnAsk.setOnClickListener{


            var randomNum = generateRandomNumber()
            var response = "Default Response"

            // complete the when to include each possible response
            // for each possible randomly generated value
            when (randomNum) {
                1 -> response = "It is certain"
                2 -> response = "It is decidedly so"
                3 -> response = "Without a doubt"
                4 -> response = "Yes definitely"
                5 -> response = "You may rely on it"
                6 -> response = "As I see it, yes"
                7 -> response = "Most likely"
                8 -> response = "Outlook good"
                9 -> response = "Yes"
                10 -> response = "Signs point to yes"
                11 -> response = "Reply hazy try again"
                12 -> response = "Ask again later"
                13 -> response = "Better not tell you now"
                14 -> response = "Cannot predict now"
                15 -> response = "Concentrate and ask again"
                16 -> response = "Don't count on it"
                17 -> response = "My reply is no"
                18 -> response = "My sources say no"
                19 -> response = "Outlook not so good"
                else -> { // Note the block
                    response = "Very doubtful"
                }
            }

            toast(response)
            Thread.sleep(1_000)
            etQuestion.setText("")
            //lblResponse.text = response
        }
    }

    fun generateRandomNumber(): Int{
        var random = Random()
        var min = 1
        var max = 20
        return random.nextInt(max + 1 - min) + min
    }
}
