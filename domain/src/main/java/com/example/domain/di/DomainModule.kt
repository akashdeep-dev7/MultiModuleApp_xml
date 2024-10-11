package com.example.domain.di

import com.example.domain.interfaces.GetHomeDataUseCase
import com.example.domain.usecases.GetHomeDataUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    @Singleton
    fun provideGetHomeDataUseCase(homeDataUseCaseImpl: GetHomeDataUseCaseImpl):GetHomeDataUseCase = homeDataUseCaseImpl
}