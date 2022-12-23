package com.example.bestrickmortyapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.bestrickmortyapp.databinding.FragmentCharactersListBinding
import com.example.bestrickmortyapp.ui.viewmodel.CharactersViewModel

class CharactersListFragment : Fragment() {

    private lateinit var charactersListBinding: FragmentCharactersListBinding
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
            for (x in characterList.results){
                println("Personaje $x")
            }
        })
    }

}