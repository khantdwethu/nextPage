package com.sample.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sample.myapplication.databinding.SingleItemBinding

class Adapter(val data: List<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(val binding: SingleItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context),parent,false);
        return ViewHolder(binding);

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.text = "hey";
    }

    override fun getItemCount(): Int {
        return 4
    }
}