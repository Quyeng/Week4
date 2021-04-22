package com.example.team10.restaurant


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.team10.R
import com.squareup.picasso.Picasso

class RestaurantAdapter : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    var data: List<Restaurant> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    //tao hang so de chuyen View
    val LIST_ITEM : Int = 0
    val GRID_ITEM : Int = 1
    var isSwitch : Boolean = true

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view : View
        if(viewType == LIST_ITEM)
            view = layoutInflater.inflate(R.layout.linear, parent, false)
        else
            view = layoutInflater.inflate(R.layout.grid, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.tvResname.text=item.res_name
        holder.tvResAddr.text=item.address
        Picasso.get().load(item.avatar).into(holder.imgRes)

    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvResname=itemView.findViewById<TextView>(R.id.tvres_name)
        //var tvResname: TextView = itemView.findViewById(R.id.tvres_name)
        val tvResAddr=itemView.findViewById<TextView>(R.id.tvaddress)
        //val imgRes=itemView.findViewById<TextView>(R.id.restaurant_image)
        //var tvResAddr: TextView = itemView.findViewById(R.id.tvaddress)
        val imgRes = itemView.findViewById<ImageView>(R.id.restaurant_image)!!
    }

    companion object {
        fun from(parent: ViewGroup): ViewHolder {
            var layoutInflater = LayoutInflater.from(parent.context)
            var view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
            return ViewHolder(view)
        }
    }
    override fun getItemViewType(position: Int): Int {
        if (isSwitch){
            return LIST_ITEM;
        }else{
            return GRID_ITEM;
        }
    }
    fun switchItemView() : Boolean
    {
        isSwitch = !isSwitch
        return isSwitch
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

