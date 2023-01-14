package com.example.bestrickmortyapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bestrickmortyapp.data.model.LocationsResponse
import com.example.bestrickmortyapp.domain.GetCharacterImageUseCase
import com.example.bestrickmortyapp.domain.GetLocationsUseCase
import kotlinx.coroutines.launch

class LocationsViewModel : ViewModel() {
    val locationsModel = MutableLiveData<LocationsResponse>()
    val isLoading = MutableLiveData<Boolean>()

    var getLocationsUseCase = GetLocationsUseCase()
    var getCharacterImageUseCase = GetCharacterImageUseCase()

    fun onCreate(page: Int?) {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getLocationsUseCase(page)
            for (i in result.results){
                if(i.residents.isNotEmpty()){
                    val id = i.residents[0].split('/').last()
                    i.coverImage = getCharacterImageUseCase(id.toInt())
                }
            }
            locationsModel.postValue(result)
            isLoading.postValue(false)
        }
    }
}