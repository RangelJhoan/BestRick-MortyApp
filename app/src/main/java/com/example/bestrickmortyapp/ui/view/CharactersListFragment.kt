package com.example.bestrickmortyapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bestrickmortyapp.databinding.FragmentCharactersListBinding
import com.example.bestrickmortyapp.ui.adapters.CharactersAdapter
import com.example.bestrickmortyapp.ui.viewmodel.CharactersViewModel

class CharactersListFragment : Fragment() {

    private lateinit var charactersListBinding: FragmentCharactersListBinding
    private lateinit var adapter: CharactersAdapter
    private val charactersViewModel: CharactersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        charactersListBinding = FragmentCharactersListBinding.inflate(layoutInflater)
        return charactersListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        charactersViewModel.onCreate()

        charactersViewModel.characterModel.observe(viewLifecycleOwner, Observer {characterList ->
            adapter = CharactersAdapter(characterList.results)
            charactersListBinding.rvCharacters.layoutManager = GridLayoutManager(context, 2)
            charactersListBinding.rvCharacters.adapter = adapter
        })
    }

}