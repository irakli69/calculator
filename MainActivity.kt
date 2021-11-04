package com.example.ika53

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    private var operand: Double = 0.0
    private var operation: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)


    }


    fun numberClick(clickedView: View) {

        if (clickedView is TextView) {

            var result = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (result == "0") {
                result = ""


            }
            resultTextView.text = result + number

        }
    }


    fun operationClick(clickedView: View){


        if (clickedView is TextView){

            val result = resultTextView.text.toString()

            if(result.isNotEmpty()){
                operand = result.toDouble()

            }
            operation = clickedView.text.toString()
            resultTextView.text = ""





        }


    }


    fun ezualsClick(clickedView: View){
        val secOperandText = resultTextView.text.toString()
        var secOperand: Double = 0.0

        if(secOperandText.isNotEmpty()){
            secOperand = secOperandText.toDouble()

        }

        when(operation){

            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "×" -> resultTextView.text = (operand * secOperand).toString()
            "÷" -> resultTextView.text = (operand / secOperand).toString()
            "%" -> resultTextView.text = (operand / 100).toString()
            "±" -> resultTextView.text = (operand * -1).toString()
        }

    }

    fun clearView(clickedView: View){
        resultTextView.text = ""
        operation = ""
        operand = 0.0
    }

    fun deleteView(clickedView: View){
        resultTextView.text = ""
        operation = ""
        operand = 0.0

    }

}