package com.example.domain.usecases

import com.example.domain.interfaces.GetHomeDataUseCase
import javax.inject.Inject

class GetHomeDataUseCaseImpl @Inject constructor():GetHomeDataUseCase {
    override fun getHomeData(): String {
        return "Hello Use Case Data"
    }
}