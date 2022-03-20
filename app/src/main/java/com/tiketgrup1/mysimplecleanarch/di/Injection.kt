package com.tiketgrup1.mysimplecleanarch.di

import com.tiketgrup1.mysimplecleanarch.data.IMessageDataSource
import com.tiketgrup1.mysimplecleanarch.data.MessageDataSource
import com.tiketgrup1.mysimplecleanarch.data.MessageRepository
import com.tiketgrup1.mysimplecleanarch.domain.IMessageRepository
import com.tiketgrup1.mysimplecleanarch.domain.MessageInteractor
import com.tiketgrup1.mysimplecleanarch.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}