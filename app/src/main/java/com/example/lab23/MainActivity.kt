package com.example.lab23

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val pictures = listOf(
            ImageItem(R.drawable.cat1, "Cat yawns"),
            ImageItem(R.drawable.cat2, "Curious cat"),
            ImageItem(R.drawable.cat3, "Cute kitten"),
            ImageItem(R.drawable.cat4, "Cat wants to eat"),
            ImageItem(R.drawable.cat5, "Cat wants to play"),
            ImageItem(R.drawable.cat6, "Kitten go to bed"),
            ImageItem(R.drawable.cat7, "Cat sleeps"),
            ImageItem(R.drawable.cat8, "Best catnds"),
            ImageItem(R.drawable.cat9, "Many homework"),
            ImageItem(R.drawable.cat10, "Fluffy"),
        )

        adapter = ImageAdapter(pictures)
        recyclerView.adapter = adapter
    }
}