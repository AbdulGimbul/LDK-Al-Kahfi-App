package com.example.ldk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ldk.Entities.List.Surah
import com.example.ldk.Entities.Models.SurahModel
import com.example.ldk.Support.Utils.Adapter
import com.example.ldk.ViewHolders.SurahViewHolder
import kotlinx.android.synthetic.main.activity_list_surah.*


class ListSurahActivity : AppCompatActivity() {
    lateinit var  adapter : Adapter<SurahModel, SurahViewHolder>
    val surah = Surah()
    val listSurah: ArrayList<SurahModel>
        get() = surah.surahList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_surah)
        setList()
    }

    private fun setList(){
        list_surah.layoutManager = LinearLayoutManager(this)
        adapter = object : Adapter<SurahModel, SurahViewHolder>(R.layout.list_surah, SurahViewHolder::class.java,
                SurahModel::class.java, listSurah){
            override fun bindView(holder: SurahViewHolder, tipeData: SurahModel, position: Int) {
                holder.onBind(applicationContext, tipeData)
            }
        }

//        list_surah.layoutManager = manager
        list_surah.adapter = adapter


    }

}
