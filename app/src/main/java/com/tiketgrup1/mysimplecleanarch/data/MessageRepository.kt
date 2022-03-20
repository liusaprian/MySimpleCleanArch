package com.tiketgrup1.mysimplecleanarch.data

import com.tiketgrup1.mysimplecleanarch.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}