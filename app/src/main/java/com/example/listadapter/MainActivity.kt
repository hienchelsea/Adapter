package com.example.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dummyRecyclerViewDiff by lazy {
        DummyRecyclerViewDiff()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcDummy.apply {
            layoutManager = StaggeredGridLayoutManager(
                1,
                StaggeredGridLayoutManager.VERTICAL
            )
            adapter = dummyRecyclerViewDiff
        }
        val lisDummy= mutableListOf<Dummy>()
        lisDummy.add(Dummy(1,"hhhh","LLLLL"))
        lisDummy.add(Dummy(2,"hhhh","LLLLL"))
        lisDummy.add(Dummy(3,"hhhh","LLLLL"))

        dummyRecyclerViewDiff.submitList(lisDummy)
    }

}