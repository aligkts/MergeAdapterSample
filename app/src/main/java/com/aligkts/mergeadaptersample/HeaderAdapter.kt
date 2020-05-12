package com.aligkts.mergeadaptersample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_header.view.*

class HeaderAdapter(private val header: Header) :
    RecyclerView.Adapter<HeaderAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(header: Header) {
            itemView.frm_color.setBackgroundColor(header.color)
            itemView.txt_header.text = header.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_header, parent, false)
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(header)

}