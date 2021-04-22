package com.example.team10.restaurant


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.team10.R

class RestaurantAdapter : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    var data: List<Restaurant> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.tvResname=item.res_name
        holder.tvResAddr=item.address
        holder.imgRes.setImageResource(item.avatar)

    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val tvResname=itemView.findViewById<TextView>(R.id.tvres_name)
        var tvResname: TextView = itemView.findViewById(R.id.tvres_name)
        var tvResAddr: TextView = itemView.findViewById(R.id.tvaddress)
        var imgRes: ImageView = itemView.findViewById(R.id.restaurant_image)
    }

    companion object {
        fun from(parent: ViewGroup): ViewHolder {
            var layoutInflater = LayoutInflater.from(parent.context)
            var view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
            return ViewHolder(view)
        }
    }

    /*fun bind(restaurant: Restaurant, listener: RestaurantAdapterListener?) {
        tvResname.text = restaurant.res_name
        tvResAddr.text = restaurant.address
        setImageResource(restaurant.avatar)
        itemView.setOnClickListener {
            listener?.onItemClicked(restaurant)
        }
    }*/
}

