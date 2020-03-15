package com.example.onlineshophomework.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshophomework.R
import com.example.onlineshophomework.model.LatestArrival
import com.example.onlineshophomework.model.PopularProduct
import kotlinx.android.synthetic.main.item_latest_arrival.view.*
import kotlinx.android.synthetic.main.item_popular_products.view.*

class LatestArrivalAdapter(var latestArrivalList: ArrayList<LatestArrival>) :
        RecyclerView.Adapter<LatestArrivalAdapter.LatestArrivalViewHolder>() {
    inner class LatestArrivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindLatestArrival(latestArrival: LatestArrival) {
            itemView.tvLatestArrivalName.text = latestArrival.latestArrivalName
            itemView.tvLatestArrivalPrice.text = latestArrival.latestArrivalPrice
            itemView.tvLatestArrivalOldPrice.text = latestArrival.latestArrivalOldPrice
            itemView.tvLatestArrivalType.text=latestArrival.latestArrivalType
            itemView.imageLatestArrival.setImageResource(latestArrival.latestImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_latest_arrival, parent, false)
        return LatestArrivalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestArrivalList.size
    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.bindLatestArrival(latestArrivalList[position])
    }
}