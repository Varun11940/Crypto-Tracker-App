package com.lcwd.cryptoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.recyclerview.widget.RecyclerView
import com.lcwd.cryptoapp.databinding.RvItemBinding



class RvAdapter(private val context: Context, private var data: ArrayList<Modal>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    fun changeData(filterData: ArrayList<Modal>) {
        data=filterData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view=RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = RvItemBinding.inflate(inflater, parent, false)
//        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        setAnimation(holder.itemView)

        holder.binding.name.text= data[position].name
        holder.binding.symbol.text= data[position].symbol
        holder.binding.price.text= data[position].price
//        val item = data[position]
//        holder.binding.textView.text = item.text // Assuming you have a textView in your RvItemBinding
    }

    override fun getItemCount(): Int {
        return data.size
    }
   fun setAnimation(view:View){
  val anim=AlphaAnimation(0.0f,2.0f)
       anim.duration=1000
       view.startAnimation(anim)
   }

    inner class ViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)
}
