package com.example.bestrickmortyapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bestrickmortyapp.databinding.FragmentEpisodesListBinding
import com.example.bestrickmortyapp.ui.adapters.episodes.EpisodesAdapter
import com.example.bestrickmortyapp.ui.viewmodel.EpisodesViewModel

class EpisodesListFragment : Fragment() {

    private lateinit var episodesListBinding: FragmentEpisodesListBinding
    private lateinit var adapter: EpisodesAdapter
    private val episodesViewModel: EpisodesViewModel by viewModels()
    private var page: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        episodesListBinding = FragmentEpisodesListBinding.inflate(layoutInflater)
        return episodesListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        episodesViewModel.onCreate(page)
        page = 1

        subscribeToObservers()
        setupButtons()

    }

    private fun subscribeToObservers() {
        episodesViewModel.episodeModel.observe(viewLifecycleOwner) { episodesResponse ->
            episodesListBinding.btnPrevious.isEnabled = episodesResponse.info.prev!=null
            episodesListBinding.btnNext.isEnabled = !episodesResponse.info.next.isNullOrEmpty()
            adapter = EpisodesAdapter(episodesResponse.results)
            episodesListBinding.rvEpisodes.layoutManager = LinearLayoutManager(context)
            episodesListBinding.rvEpisodes.adapter = adapter
        }

        episodesViewModel.isLoading.observe(viewLifecycleOwner) {
            episodesListBinding.pbProgress.isVisible = it
        }
    }

    private fun setupButtons() {
        episodesListBinding.btnPrevious.setOnClickListener {
            page = page?.dec()
            episodesViewModel.onCreate(page)
        }

        episodesListBinding.btnNext.setOnClickListener{
            page = page?.inc()
            episodesViewModel.onCreate(page)
        }
    }
}