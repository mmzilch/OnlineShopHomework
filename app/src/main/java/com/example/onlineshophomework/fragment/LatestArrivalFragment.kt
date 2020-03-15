package com.example.onlineshophomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.onlineshophomework.R
import com.example.onlineshophomework.adapter.ChoosebyCountryAdapter
import com.example.onlineshophomework.adapter.LatestArrivalAdapter
import com.example.onlineshophomework.model.ChoosebyCountry
import com.example.onlineshophomework.model.LatestArrival
import kotlinx.android.synthetic.main.fragment_choose_by_country.view.*
import kotlinx.android.synthetic.main.fragment_latest_arrival.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_latest_arrival, container, false)

        var latestArrivalArray=ArrayList<LatestArrival>()

        latestArrivalArray.add(LatestArrival(R.drawable.purse,"Hyde Park N41015","Louis Vuitton","999,99999Ks","110000"))
        latestArrivalArray.add(LatestArrival(R.drawable.blouse,"Kyle Long T Shirt","Kyle","2100000Ks","220000"))
        latestArrivalArray.add(LatestArrival(R.drawable.purse,"Hyde Park N41015","Louis Vuitton","999,99999Ks","3300000"))


        var latestArrivalAdapter= LatestArrivalAdapter(latestArrivalArray)
        root.rcyLatestArrival.layoutManager= LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, true)
        root.rcyLatestArrival.adapter=latestArrivalAdapter
        // Inflate the layout for this fragment
        return root
    }

}
