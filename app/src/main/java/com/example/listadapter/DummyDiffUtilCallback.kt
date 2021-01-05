package com.example.listadapter

import androidx.recyclerview.widget.DiffUtil

class DummyDiffUtilCallback: DiffUtil.ItemCallback<Dummy>() {
    override fun areItemsTheSame(oldItem: Dummy, newItem: Dummy): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Dummy, newItem: Dummy): Boolean {
        return oldItem == newItem
    }
}
