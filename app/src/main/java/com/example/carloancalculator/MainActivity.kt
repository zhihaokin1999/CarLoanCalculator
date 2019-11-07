package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btnCalc.setOnClickListener(){
    calc()
}
    }

    private fun calc(){
        val price:Double = txtCarPrice.text.toString().toDouble()
        val dp:Double = txtDownPayment.text.toString().toDouble()
        val carLoan:Double = price - dp
        val interestRate:Double= txtInterestRate.text.toString().toDouble()
        val loanPeriod:Double=txtLoanPeriod.text.toString().toDouble()
        val interest:Double = carLoan * interestRate * loanPeriod
        val monthlyRepayment=(carLoan+interest)/loanPeriod/12
        textView7.text= "CarLoan:  " + carLoan+"\n"+ "Interest:  "+interest +"\n"+ "Monthly repayment:  "+ monthlyRepayment
    }
}
