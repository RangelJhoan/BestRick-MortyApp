package com.example.bestrickmortyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.bestrickmortyapp.databinding.FragmentChaptersListBinding
import com.example.bestrickmortyapp.databinding.FragmentCharactersListBinding

class ChaptersListFragment : Fragment() {

    private lateinit var chaptersListBinding: FragmentChaptersListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chaptersListBinding = FragmentChaptersListBinding.inflate(layoutInflater)
        return chaptersListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "Hola, soy el fragment de capítulos", Toast.LENGTH_LONG).show()
    }
}