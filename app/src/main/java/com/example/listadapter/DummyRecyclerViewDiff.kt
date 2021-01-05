package com.example.listadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class DummyRecyclerViewDiff : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val listDummy: MutableList<Dummy> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_dummy, parent, false))
    }

    override fun getItemCount(): Int = listDummy.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(listDummy[position])
    }

    fun submitList(dummy: List<Dummy>) {
        val diffResult = DiffUtil.calculateDiff(DummyDiffUtil(listDummy, dummy))
        listDummy.clear()
        listDummy.addAll(dummy)
        diffResult.dispatchUpdatesTo(this)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Dummy) {
            //  itemView.taskTitle.text = task.title
        }
    }
}