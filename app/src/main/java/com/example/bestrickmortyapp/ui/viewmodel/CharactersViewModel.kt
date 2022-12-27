package com.example.bestrickmortyapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bestrickmortyapp.data.model.CharactersResponse
import com.example.bestrickmortyapp.domain.GetCharactersUseCase
import kotlinx.coroutines.launch

class CharactersViewModel : ViewModel() {

    val characterModel = MutableLiveData<CharactersResponse>()

    var getCharactersUseCase = GetCharactersUseCase()

    fun onCreate(page: Int?) {
        viewModelScope.launch {
            val result = getCharactersUseCase(page)
            characterModel.postValue(result)
        }
    }

}