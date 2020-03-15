package com.example.onlineshophomework.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshophomework.R
import com.example.onlineshophomework.model.PopularProduct
import kotlinx.android.synthetic.main.item_popular_products.view.*

class PopularProductAdapter(var popularProductList: ArrayList<PopularProduct>) :
        RecyclerView.Adapter<PopularProductAdapter.PopularProductViewHolder>() {
    inner class PopularProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindPopularProduct(popularProduct: PopularProduct) {
            itemView.tvPopularProductName.text = popularProduct.popularProductName
            itemView.tvPopularProductType.text = popularProduct.popularProductType
            itemView.tvPopularProductsPrice.text=popularProduct.popularProductPrice
            itemView.tvPopularProductsOldPrice.text=popularProduct.popularProductOldPrice
            itemView.imagePopularProduct.setImageResource(popularProduct.popularProductImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductViewHolder {
        var view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_popular_products, parent, false)
        return PopularProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductList.size
    }

    override fun onBindViewHolder(holder: PopularProductViewHolder, position: Int) {
        holder.bindPopularProduct(popularProductList[position])
    }
}