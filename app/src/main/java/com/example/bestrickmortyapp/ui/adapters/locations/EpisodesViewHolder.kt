package com.example.bestrickmortyapp.ui.adapters.locations

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.data.model.Episode
import com.example.bestrickmortyapp.databinding.ItemEpisodesBinding
import java.text.SimpleDateFormat

class EpisodesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val episodeListBinding = ItemEpisodesBinding.bind(view)

    fun bind(episode: Episode){
        val dateFormatter = SimpleDateFormat("dd-MM-yyyy")
        episodeListBinding.tvName.text = episode.name
        episodeListBinding.tvName.setLines(2)
        episodeListBinding.tvAirDate.text = episode.airDate
        episodeListBinding.tvAirDate.setLines(2)
        episodeListBinding.tvEpisode.text = episode.episode
        episodeListBinding.tvEpisode.setLines(2)
        episodeListBinding.tvCreated.text = dateFormatter.format(episode.created)
        episodeListBinding.tvCreated.setLines(2)
    }

}