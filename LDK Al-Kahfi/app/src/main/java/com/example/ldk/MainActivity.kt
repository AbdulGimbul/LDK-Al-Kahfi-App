package com.example.ldk

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ldk.DivisiData.listData
import com.example.ldk.DivisiData.listDev
import com.example.ldk.Modules.Database.DatabaseHelper
import com.example.ldk.Modules.ImportFromFile.Literation
import com.example.ldk.Modules.ImportFromFile.LiterationInteractor
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), Literation {
    private val list1 = ArrayList<Divisi>()
    private val list = ArrayList<Divisi>()
    private lateinit var rv_divisi: RecyclerView
    val interactor = LiterationInteractor(this, this)
    val databaseHelper = DatabaseHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_divisi =findViewById(R.id.rv_divisi)
        rv_divisi.setHasFixedSize(true)
        list.addAll(listData)
        list1.addAll(listDev)
        showRecyclerList()
        supportActionBar
    }

    private fun showSelectedDivisi(divisi: Divisi?) {
        val intent = Intent(this@MainActivity, DetailsActivity::class.java)
        intent.putExtra("image", divisi!!.photo)
        intent.putExtra("name", divisi.name)
        intent.putExtra("detail", divisi.detail)
        intent.putExtra("koord", divisi.bph)
        intent.putExtra("sekre", divisi.sekretaris)
        intent.putExtra("bendahara", divisi.bendahara)

        startActivity(intent)
    }

    fun showRecyclerList() {
        rv_divisi.layoutManager = LinearLayoutManager(this)
        val listDivisiAdapter = ListDivisiAdapter(list)
        rv_divisi.adapter = listDivisiAdapter
        listDivisiAdapter.setOnItemClickCallback(object : ListDivisiAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Divisi?) {
                showSelectedDivisi(data)
            }
        })
    }
    fun ShowAbout(){
        rv_divisi.layoutManager = GridLayoutManager(this, 2)
        val gridDivisiAdapter = AboutAdapter(list1)
        rv_divisi.adapter = gridDivisiAdapter
    }

    fun showRecyclerGrid() {
        rv_divisi.layoutManager = GridLayoutManager(this, 2)
        val gridDivisiAdapter = GridDivisiAdapter(list)
        rv_divisi.adapter = gridDivisiAdapter
        gridDivisiAdapter.setOnItemClickCallback(object : GridDivisiAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Divisi?) {
                showSelectedDivisi(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> showRecyclerList()
            R.id.action_grid -> showRecyclerGrid()
            R.id.info -> ShowAbout()
            R.id.action_quran -> {
                if (databaseHelper.isDataAvailable()){
                    openNextActivity()
                }else{
                    databaseHelper.clearTable()
                    interactor.setData()
                }
            }
            R.id.action_shalawat ->{
                val intent = Intent(this@MainActivity, RatibActivity::class.java)
                startActivity(intent)
            }
            R.id.action_registrasi ->{
                val intent = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.action_wirid ->{
                val intent = Intent(this@MainActivity, WiridActivity::class.java)
                startActivity(intent)
            }

        }
    }
    override fun successInputDatabase() {
        openNextActivity()
    }

    override fun failedInputDatabase() {
        databaseHelper.clearTable()
        interactor.setData()
    }
    fun openNextActivity(){
        val intent = Intent(this@MainActivity, ListSurahActivity::class.java)
        startActivity(intent)
    }
}