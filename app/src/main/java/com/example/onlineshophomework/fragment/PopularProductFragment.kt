package com.example.onlineshophomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.onlineshophomework.R
import com.example.onlineshophomework.adapter.LatestArrivalAdapter
import com.example.onlineshophomework.adapter.PopularProductAdapter
import com.example.onlineshophomework.model.LatestArrival
import com.example.onlineshophomework.model.PopularProduct
import kotlinx.android.synthetic.main.fragment_latest_arrival.view.*
import kotlinx.android.synthetic.main.fragment_popular_product.view.*
import kotlinx.android.synthetic.main.item_popular_products.*

/**
 * A simple [Fragment] subclass.
 */
class PopularProductFragment : Fragment()//,RatingBar.OnRatingBarChangeListener
{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_popular_product, container, false)
        var popularProductArray=ArrayList<PopularProduct>()

        popularProductArray.add(PopularProduct(R.drawable.phone,"iPhone 8plus","Apple","999,99Ks","77000"))
        popularProductArray.add(PopularProduct(R.drawable.bed,"Kyle bed","Bed","2100000Ks","990000"))
        popularProductArray.add(PopularProduct(R.drawable.dress,"Canon Camera","Canon","9999Ks","4400"))
        popularProductArray.add(PopularProduct(R.drawable.game,"Short Dress","Dress","8899Ks","6699"))


        var popularProductAdapter= PopularProductAdapter(popularProductArray)

        //ratingBarPopularProduct.onRatingBarChangeListener=this

        root.rcyPopularProduct.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL, true)
        root.rcyPopularProduct.adapter=popularProductAdapter
        // Inflate the layout for this fragment
        return root
    }

    /*override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
        if (rating!=null) {
            btnPopularProductDiscount.visibility
        }
        }*/
    }

