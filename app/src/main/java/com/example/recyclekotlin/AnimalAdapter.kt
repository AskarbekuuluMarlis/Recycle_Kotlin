package com.example.recyclekotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclekotlin.databinding.ItemAnimalBinding

class AnimalAdapter(
    private val animalList: List<Zoo>
) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            ItemAnimalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.onBind(animalList[position])
    }

    class AnimalViewHolder(private var binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animal: Zoo) {
            binding.tvAnimal.text = animal.name
            binding.imgAnimal.loadImage(animal.img)

        }
    }

}

