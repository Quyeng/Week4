package com.example.team10.restaurant.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.team10.R
import com.example.team10.databinding.ActivityRestaurantBinding
import com.example.team10.databinding.RestaurantFragmentBinding
import com.example.team10.restaurant.data.getdataSet
import com.example.team10.restaurant.ui.RestaurantAdapter
import kotlinx.android.synthetic.main.restaurant_fragment.*

class RestaurantFragment : Fragment() {

    companion object {
        fun newInstance() = RestaurantFragment()
    }
    private lateinit var binding: RestaurantFragmentBinding
    private lateinit var viewModel: com.example.team10.restaurant.ui.fragments.RestaurantViewModel
    private  lateinit var adapter : RestaurantAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.restaurant_fragment,container,false)
        adapter = RestaurantAdapter()
        binding.RestaurantList.adapter = adapter
        adapter.data = getdataSet()
        setHasOptionsMenu(true)
        val view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)
        // TODO: Use the ViewModel
        SwitchView()
    }

    fun SwitchView(){
        viewModel = ViewModelProvider(this).get(com.example.team10.restaurant.ui.fragments.RestaurantViewModel::class.java)
        btn_switch.setOnClickListener {
            adapter.switchView()
            if (adapter.switchView()) {
                RestaurantList.layoutManager = GridLayoutManager(activity, 2)
            } else {
                RestaurantList.layoutManager = LinearLayoutManager(activity)
            }
            adapter.switchView()
            adapter.notifyDataSetChanged()
        }
    }

}