package com.example.bestrickmortyapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bestrickmortyapp.data.model.Episode
import com.example.bestrickmortyapp.data.model.EpisodesResponse
import com.example.bestrickmortyapp.domain.GetEpisodesUseCase
import kotlinx.coroutines.launch

class EpisodesViewModel: ViewModel() {

    val episodeModel = MutableLiveData<EpisodesResponse>()
    val isLoading = MutableLiveData<Boolean>()

    var getEpisodesUseCase = GetEpisodesUseCase()

    fun onCreate(page: Int?){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getEpisodesUseCase(page)
            episodeModel.postValue(result)
            isLoading.postValue(false)
        }
    }



}