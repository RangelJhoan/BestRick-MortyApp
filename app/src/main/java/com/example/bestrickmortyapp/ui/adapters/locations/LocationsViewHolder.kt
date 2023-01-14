package com.example.bestrickmortyapp.ui.adapters.locations

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.R
import com.example.bestrickmortyapp.data.model.Locations
import com.example.bestrickmortyapp.databinding.ItemLocationsBinding
import com.squareup.picasso.Picasso

class LocationsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemLocationsBinding.bind(view)

    fun bind(locations: Locations) {
        val a:String? = null
        Picasso.get()
            .load(a)
            .error(R.drawable.ic_baseline_broken_image_24)
            .into(binding.ivCharacter)

        binding.tvName.text = locations.name
    }

}