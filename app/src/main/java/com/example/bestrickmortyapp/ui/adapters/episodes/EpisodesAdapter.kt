package com.example.bestrickmortyapp.ui.adapters.episodes

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.R
import com.example.bestrickmortyapp.data.model.Episode

class EpisodesAdapter(val episodesList: List<Episode>): RecyclerView.Adapter<EpisodesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EpisodesViewHolder(layoutInflater.inflate(R.layout.item_episodes, parent, false))
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: EpisodesViewHolder, position: Int) {
        holder.bind(episodesList[position])
    }

    override fun getItemCount(): Int = episodesList.size
}