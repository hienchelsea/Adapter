package com.example.listadapter

import androidx.recyclerview.widget.DiffUtil

class DummyDiffUtil(
    private val oldDummy: List<Dummy>,
    private val newDummy: List<Dummy>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldDummy.size

    override fun getNewListSize(): Int = newDummy.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldDummy[oldItemPosition].id == newDummy[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldUserName = oldDummy[oldItemPosition]
        val newUserName = newDummy[newItemPosition]
        return oldUserName == newUserName
    }
}
