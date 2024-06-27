package com.example.recyclekotlin

import android.provider.MediaStore.Images
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun ImageView.loadImage(url: String){
Glide.with(this).load(url).into(this)
}