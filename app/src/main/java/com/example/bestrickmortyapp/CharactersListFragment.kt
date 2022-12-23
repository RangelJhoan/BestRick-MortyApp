package com.example.bestrickmortyapp

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.bestrickmortyapp.databinding.FragmentCharactersListBinding

class CharactersListFragment : Fragment() {

    private lateinit var charactersListBinding: FragmentCharactersListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        charactersListBinding = FragmentCharactersListBinding.inflate(layoutInflater)
        return charactersListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "Hola, soy el fragment de personajes", Toast.LENGTH_LONG).show()
    }

}