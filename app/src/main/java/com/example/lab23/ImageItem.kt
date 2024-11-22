package com.example.lab23

data class ImageItem(
    val picture: Int,
    val caption: String,
    var isLiked: Boolean = false
)