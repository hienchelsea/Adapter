package com.example.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DummyAdapter : ListAdapter<Dummy, RecyclerView.ViewHolder>(DummyDiffUtilCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderFile(inflater.inflate(R.layout.item_dummy, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolderFile).bind(currentList[position])
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads)
        } else {
            if (payloads.any { it is InfoMessageChanged }) {
                (holder as ViewHolderFile).bind(currentList[position])
            }
        }
    }

    inner class ViewHolderFile(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Dummy) {

        }
    }

    class InfoMessageChanged
}
