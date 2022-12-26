package com.example.bestrickmortyapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bestrickmortyapp.data.model.CharacterList
import com.example.bestrickmortyapp.domain.GetCharactersUseCase
import kotlinx.coroutines.launch

class CharactersViewModel : ViewModel() {

    val characterModel = MutableLiveData<CharacterList>()

    var getCharactersUseCase = GetCharactersUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getCharactersUseCase()
            characterModel.postValue(result)
        }
    }

}