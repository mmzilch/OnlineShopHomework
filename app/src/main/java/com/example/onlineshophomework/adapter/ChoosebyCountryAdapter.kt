package com.example.onlineshophomework.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshophomework.R
import com.example.onlineshophomework.model.ChoosebyCountry
import com.example.onlineshophomework.model.LatestArrival
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_choose_by_country.view.*
import kotlinx.android.synthetic.main.item_latest_arrival.view.*

class ChoosebyCountryAdapter(var choosebyCountryViewHolderList: ArrayList<ChoosebyCountry>) :
        RecyclerView.Adapter<ChoosebyCountryAdapter.ChoosebyCountryViewHolder>() {
    inner class ChoosebyCountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindChoosebyCountry(choosebyCountry: ChoosebyCountry) {
            itemView.imageChoosebyCountry.setImageResource(choosebyCountry.countryImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChoosebyCountryViewHolder {
        var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_choose_by_country, parent, false)
        return ChoosebyCountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return choosebyCountryViewHolderList.size
    }

    override fun onBindViewHolder(holder: ChoosebyCountryViewHolder, position: Int) {
        holder.bindChoosebyCountry(choosebyCountryViewHolderList[position])
    }
}