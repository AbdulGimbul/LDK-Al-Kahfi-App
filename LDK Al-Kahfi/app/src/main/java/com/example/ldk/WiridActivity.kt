package com.example.ldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ratib.*

class WiridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wirid)
        supportActionBar

        pdfView.fromAsset("wirdullatif.pdf")
                .load()
    }
}
