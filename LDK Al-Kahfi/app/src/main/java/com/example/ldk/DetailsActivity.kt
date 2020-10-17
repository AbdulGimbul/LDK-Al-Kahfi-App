package com.example.ldk

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    var nameDivisi: String? = null
    var detailDivisi: String? = null
    var koordDivisi: String? = null
    var sekreDivisi: String? = null
    var bendaharaDivisi: String? = null
    var photo = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar    
        nameDivisi = intent.getStringExtra("name")
        detailDivisi = intent.getStringExtra("detail")
        photo = intent.getIntExtra("image", 0)
        koordDivisi = intent.getStringExtra("koord")
        sekreDivisi = intent.getStringExtra("sekre")
        bendaharaDivisi = intent.getStringExtra("bendahara")
        name.setText(nameDivisi)
        detail.setText(detailDivisi)
        image.setImageResource(photo)
        koord_divisi.setText(koordDivisi)
        sekre_divisi.setText(sekreDivisi)
        bendahara_divisi.setText(bendaharaDivisi)
    }
}