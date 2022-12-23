package com.example.bestrickmortyapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.bestrickmortyapp.databinding.FragmentLocationsListBinding

class LocationsListFragment : Fragment() {

    private lateinit var locationListBinding: FragmentLocationsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        locationListBinding = FragmentLocationsListBinding.inflate(layoutInflater)
        return locationListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "Hola, soy el fragment de ubicaciones", Toast.LENGTH_LONG).show()
    }
}