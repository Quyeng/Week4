package com.example.team10.restaurant


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.team10.R

class RestaurantAdapter : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>(){

    var data : List<Restaurant> = listOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.restaurant_item, parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = data[position]

    }

   class ViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
        val tvRestaurantName: TextView = itemView.findViewById(R.id.tvres_name)
        val tvRestaurantAddress: TextView = itemView.findViewById(R.id.tvaddress)
        val imgRestaurant: ImageView = itemView.findViewById(R.id.restaurant_image)
   }

    companion object {
        fun from(parent: ViewGroup) : ViewHolder {
            var layoutInflater = LayoutInflater.from(parent.context)
            var view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
            return ViewHolder(view)
        }
    }

    fun bind(item: Restaurant, listener: RestaurantAdapterListener?) {
        tvRestaurantName.text = item.res_name
        tvRestaurantAddress.text = item.address
        restaurant_image.setImageResource(item.avatar)
            itemView.setOnClickListener {
            listener?.onClickItem(item)

}