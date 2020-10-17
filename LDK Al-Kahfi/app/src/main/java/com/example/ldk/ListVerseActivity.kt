package com.example.ldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ldk.Entities.Models.Quran
import com.example.ldk.Modules.Database.DatabaseHelper
import com.example.ldk.Modules.Database.DatabasePresenter
import com.example.ldk.Modules.Database.DatabaseView
import com.example.ldk.Support.Utils.Adapter
import com.example.ldk.ViewHolders.VerseViewHolder
import kotlinx.android.synthetic.main.activity_list_verse.*


class ListVerseActivity : AppCompatActivity(), DatabaseView {
    lateinit var  adapter: Adapter<Quran, VerseViewHolder>
    lateinit var bundle: Bundle

    var presenter = DatabasePresenter(DatabaseHelper(this), this)
    var surahTitle = ""
    var surahId = 1
    var verseId = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_verse)

        bundle = intent.extras!!
        surahTitle = bundle.getString("surahTitle").toString()
        surahId = bundle.getInt("surahId")
        verseId = bundle.getInt("verseId")

        presenter.getDataBySurahId(surahId)

        text_title_surah.text = surahTitle
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun successGetDataBySurahId(list: List<Quran>) {
        setList(list)
    }

    fun setList(list: List<Quran>) {


        val manager = LinearLayoutManager(this)
        adapter = object : Adapter<Quran, VerseViewHolder>(R.layout.list_verse, VerseViewHolder::class.java,
                Quran::class.java, list) {
            override fun bindView(holder: VerseViewHolder, tipeData: Quran, position: Int) {
                holder.onBind(tipeData)

            }
        }

        list_verse.layoutManager = manager
        list_verse.adapter = adapter
    }


}
