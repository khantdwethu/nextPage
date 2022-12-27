package com.sample.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sample.myapplication.databinding.SingleItemBinding

class NameAdapter(val data: List<String>) : RecyclerView.Adapter<NameAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: SingleItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context),parent,false);
        return ViewHolder(binding);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.text = data[position];
    }

    override fun getItemCount(): Int {
        return data.size
    }
}