package com.example.ldk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.ldk.ListDivisiAdapter.ListViewHolder
import java.util.*

class ListDivisiAdapter(private val listDivisi: ArrayList<Divisi>) : RecyclerView.Adapter<ListViewHolder>() {
    private var onItemClickCallback: OnItemClickCallback? = null
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback?) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_divisi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val divisi = listDivisi[position]
        Glide.with(holder.itemView.context)
                .load(divisi.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.tvName.text = divisi.name
        holder.tvDetail.text = divisi.detail
        holder.tvBph.text = divisi.bph
        holder.tvSekretatis.text = divisi.sekretaris
        holder.tvBendahara.text = divisi.bendahara
        holder.itemView.setOnClickListener { onItemClickCallback?.onItemClicked(listDivisi[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listDivisi.size
    }

    inner class ListViewHolder(itemView: View) : ViewHolder(itemView) {
        var imgPhoto: ImageView
        var tvName: TextView
        var tvDetail: TextView
        var tvBph: TextView
        var tvSekretatis: TextView
        var tvBendahara: TextView

        init {
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
            tvName = itemView.findViewById(R.id.tv_item_name)
            tvDetail = itemView.findViewById(R.id.tv_item_detail)
            tvBph = itemView.findViewById(R.id.tv_koord_divisi)
            tvSekretatis = itemView.findViewById(R.id.tv_sekre_divisi)
            tvBendahara = itemView.findViewById(R.id.tv_bendahara_divisi)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Divisi?)
    }

}