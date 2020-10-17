package com.example.ldk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.ldk.GridDivisiAdapter.GridViewHolder
import java.util.*

class GridDivisiAdapter(private val listDivisi: ArrayList<Divisi>) : RecyclerView.Adapter<GridViewHolder>() {
    private var onItemClickCallback: OnItemClickCallback? = null
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback?) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_divisi, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
                .load(listDivisi[position].photo)
                .apply(RequestOptions().override(150, 150))
                .into(holder.imgPhoto)
        holder.itemView.setOnClickListener { onItemClickCallback!!.onItemClicked(listDivisi[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listDivisi.size
    }

    inner class GridViewHolder(itemView: View) : ViewHolder(itemView) {
        var imgPhoto: ImageView

        init {
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Divisi?)
    }

}