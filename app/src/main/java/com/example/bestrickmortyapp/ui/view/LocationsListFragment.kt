package com.example.bestrickmortyapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bestrickmortyapp.databinding.FragmentLocationsListBinding
import com.example.bestrickmortyapp.ui.adapters.episodes.EpisodesAdapter
import com.example.bestrickmortyapp.ui.adapters.locations.LocationAdapter
import com.example.bestrickmortyapp.ui.viewmodel.LocationsViewModel

class LocationsListFragment : Fragment() {

    private lateinit var locationListBinding: FragmentLocationsListBinding
    private val locationsViewModel: LocationsViewModel by viewModels()
    private lateinit var adapter: LocationAdapter
    private var page: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        locationListBinding = FragmentLocationsListBinding.inflate(layoutInflater)
        return locationListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        locationsViewModel.onCreate(page)
        page = 1
        subscribeToObservers()
        setupButtons()
    }

    private fun setupButtons() {
        locationListBinding.btnNext.setOnClickListener {
            page = page?.inc()
            locationsViewModel.onCreate(page)
        }
        locationListBinding.btnPrevious.setOnClickListener {
            page = page?.dec()
            locationsViewModel.onCreate(page)
        }
    }

    private fun subscribeToObservers() {
        locationsViewModel.locationsModel.observe(viewLifecycleOwner){ locationResponse ->
            locationListBinding.rvLocations.layoutManager = GridLayoutManager(context, 2)
            adapter = LocationAdapter(locationResponse.results)
            locationListBinding.rvLocations.adapter = adapter
        }

        locationsViewModel.isLoading.observe(viewLifecycleOwner){isLoad ->
            locationListBinding.pbProgress.isVisible = isLoad
        }
    }
}