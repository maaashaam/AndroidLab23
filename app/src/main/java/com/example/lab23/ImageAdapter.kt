package com.example.lab23

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val items: List<ImageItem>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount() = items.size

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)
        private val likeButton: Button = itemView.findViewById(R.id.likeButton)

        fun bind(item: ImageItem) {
            imageView.setImageResource(item.picture)
            textView.text = item.caption
            likeButton.text = if (item.isLiked) "Liked" else "Like"

            likeButton.setOnClickListener {
                item.isLiked = !item.isLiked
                likeButton.text = if (item.isLiked) "Liked" else "Like"
            }
        }
    }
}