package com.geektech.hw_6_1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.hw_6_1.databinding.ItemClickBinding

class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    private var arrayList = ArrayList<String>()

    inner class HistoryViewHolder(private val binding: ItemClickBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(click: String) {
            binding.rvClicker.text = click
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            ItemClickBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    fun initList(list: ArrayList<String>) {
        arrayList = list
        notifyDataSetChanged()
    }
}