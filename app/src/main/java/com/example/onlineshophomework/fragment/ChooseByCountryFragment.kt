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
import com.example.onlineshophomework.model.ChoosebyCountry
import kotlinx.android.synthetic.main.fragment_choose_by_country.view.*

/**
 * A simple [Fragment] subclass.
 */
class ChooseByCountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_choose_by_country, container, false)
        var choosebyCountryArray=ArrayList<ChoosebyCountry>()

        choosebyCountryArray.add(ChoosebyCountry(R.drawable.china))
        choosebyCountryArray.add(ChoosebyCountry(R.drawable.korea))
        choosebyCountryArray.add(ChoosebyCountry(R.drawable.china))
        choosebyCountryArray.add(ChoosebyCountry(R.drawable.international))

        var choosebyCountryAdapter= ChoosebyCountryAdapter(choosebyCountryArray)
        root.rcyChoosebyCountry.layoutManager= GridLayoutManager(context,2)
        root.rcyChoosebyCountry.adapter=choosebyCountryAdapter
        // Inflate the layout for this fragment
        return root
    }

}
