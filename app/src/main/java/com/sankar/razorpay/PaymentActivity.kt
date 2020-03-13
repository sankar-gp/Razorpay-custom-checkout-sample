package com.sankar.razorpay

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class PaymentActivity: Activity() {

    val activity = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_payment)
        val button : Button = findViewById(R.id.pay_btn)
        button.setOnClickListener {
            val intent = Intent(this,PaymentOptions::class.java)
            startActivity(intent)
        }
    }
}