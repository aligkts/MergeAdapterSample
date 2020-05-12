package com.aligkts.mergeadaptersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var headerAdapter: HeaderAdapter
    private lateinit var titleAdapter: TitleAdapter
    private lateinit var imageAdapter: ImageAdapter
    private lateinit var mergeAdapter: MergeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerview()
    }

    private fun initRecyclerview() {
        headerAdapter = HeaderAdapter(MergeAdapterDataSource.getHeader())
        titleAdapter = TitleAdapter(MergeAdapterDataSource.getTitle())
        imageAdapter = ImageAdapter(MergeAdapterDataSource.getImage())
        mergeAdapter = MergeAdapter(headerAdapter, titleAdapter, imageAdapter)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mergeAdapter
        }
    }

}
