package com.example.bestrickmortyapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.R
import com.example.bestrickmortyapp.data.model.Characters

class CharactersAdapter(val charactersList: List<Characters>):RecyclerView.Adapter<CharactersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharactersViewHolder(layoutInflater.inflate(R.layout.item_characters, parent, false))
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val item = charactersList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = charactersList.size

}