package com.oca.idn.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        val inputUsername = et_username.text.toString().trim()
        val inputEmail = et_email.text.toString().trim()
        val inputNotelephone = et_telephone.text.toString().trim()
        val inputCountry = et_country.text.toString().trim()

        when{
            inputUsername.isEmpty() -> {
                et_username.error = getString(R.string.txt_error)
            }
            inputEmail.isEmpty() -> {
                et_email.error = getString(R.string.txt_error)
            }
            inputNotelephone.isEmpty() -> {
                et_telephone.error = getString(R.string.txt_error)
        }
            inputCountry.isEmpty() -> {
                et_country.error = getString(R.string.txt_error)
            }
            else -> {
                val intentData = Intent(this, InputRegister::class.java)
                intentData.putExtra("Terima Username", inputUsername)
                intentData.putExtra("Terima Email", inputEmail)
                intentData.putExtra("Terima No.Telephone", inputNotelephone)
                intentData.putExtra("Terima Country", inputCountry)
                startActivity(intentData)

            }
    }


}
}