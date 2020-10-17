package com.example.ldk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class AboutAdapter(private val listDev: ArrayList<Divisi>) : RecyclerView.Adapter<AboutAdapter.AboutHolder>() {

    inner class AboutHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName : TextView = itemView.findViewById(R.id.tv_about_name)
        val tvNim : TextView = itemView.findViewById(R.id.tv_about_nim)
        val tvPicture : ImageView = itemView.findViewById(R.id.img_about_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): AboutHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_about, viewGroup, false)
        return AboutHolder(view)

    }

    override fun getItemCount(): Int {
        return listDev.size
    }

    override fun onBindViewHolder(holder: AboutAdapter.AboutHolder, position: Int) {
        val divisi = listDev[position]
        Glide.with(holder.itemView.context)
                .load(divisi.picture)
                .apply(RequestOptions().override(200,200))
                .into(holder.tvPicture)
        holder.tvName.text = divisi.dev
        holder.tvNim.text=divisi.nim
    }
}