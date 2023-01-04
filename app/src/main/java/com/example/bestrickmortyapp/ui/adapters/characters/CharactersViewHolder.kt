package com.example.bestrickmortyapp.ui.adapters.characters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.R
import com.example.bestrickmortyapp.data.model.Character
import com.example.bestrickmortyapp.databinding.ItemCharactersBinding
import com.squareup.picasso.Picasso

class CharactersViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemCharactersBinding.bind(view)

    fun bind(character: Character){
        Picasso.get()
            .load(character.image)
            .error(R.drawable.ic_baseline_broken_image_24)
            .into(binding.ivAvatar)
        binding.tvName.text = character.name
    }

}