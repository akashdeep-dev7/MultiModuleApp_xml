package com.example.home

import androidx.lifecycle.ViewModel
import com.example.domain.interfaces.GetHomeDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeDataUseCase: GetHomeDataUseCase) :ViewModel() {
    val data = homeDataUseCase.getHomeData()
}