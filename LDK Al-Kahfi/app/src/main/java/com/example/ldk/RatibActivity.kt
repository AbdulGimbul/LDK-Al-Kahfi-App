package com.example.ldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ratib.*

class RatibActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ratib)
        supportActionBar

        pdfView.fromAsset("ratibul-haddad.pdf")
                .load()

    }
}
