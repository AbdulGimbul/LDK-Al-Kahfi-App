package com.example.ldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar

        ButtonRegister.setOnClickListener{
            val toast = Toast.makeText(this, "Data anda telah kami simpan. Silahkan tunggu " +
                "" +
                "pemberitahuan lebih lanjut melalui WhatsApp atau Email", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER or Gravity.CENTER_HORIZONTAL, 0, 0)
        toast.show()}
    }
}
