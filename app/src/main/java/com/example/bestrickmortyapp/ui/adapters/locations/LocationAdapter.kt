package com.example.bestrickmortyapp.ui.adapters.locations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bestrickmortyapp.R
import com.example.bestrickmortyapp.data.model.Locations

class LocationAdapter(val locationsList: List<Locations>): RecyclerView.Adapter<LocationsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LocationsViewHolder(layoutInflater.inflate(R.layout.item_locations, parent, false))
    }

    override fun onBindViewHolder(holder: LocationsViewHolder, position: Int) {
        holder.bind(locationsList[position])
    }

    override fun getItemCount(): Int = locationsList.size
}