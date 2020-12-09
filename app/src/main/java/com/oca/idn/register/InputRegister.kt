package com.oca.idn.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input_register.*

class InputRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_register)
        val intenTerima = intent
        val terimaUsername = intenTerima.getStringExtra("Terima Username")
        val terimaEmail = intenTerima.getStringExtra("Terima Email")
        val terimaNotelephone = intenTerima.getStringExtra("Terima No.Telephone")
        val terimaCountry = intenTerima.getStringExtra("Terima Country")
        tv_username.text = terimaUsername
        tv_email.text = terimaEmail
        tv_telephone.text = terimaNotelephone
        tv_country.text = terimaCountry


    }
}