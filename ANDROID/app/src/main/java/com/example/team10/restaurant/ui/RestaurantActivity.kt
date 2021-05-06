package com.example.team10.restaurant.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.team10.R
import com.example.team10.databinding.ActivityRestaurantBinding
import com.example.team10.restaurant.RestaurantViewModel
import com.example.team10.restaurant.data.getdataSet
import com.example.team10.restaurant.ui.fragments.RestaurantFragment
import kotlinx.android.synthetic.main.activity_restaurant.*
import androidx.fragment.app.add


class RestaurantActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantBinding
    private lateinit var viewModel: RestaurantViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        supportFragmentManager.commit {
            setReorderingAllowed(true)

            add<RestaurantFragment>(R.id.frag_container_restaurant)
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.frag_container_retaurant,BlankFragment())
//        transaction.addToBackStack(null)
//        transaction.commit()
        }

        //stackoverflow


    }

}
