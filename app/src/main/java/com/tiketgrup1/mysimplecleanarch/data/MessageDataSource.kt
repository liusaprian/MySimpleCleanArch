package com.tiketgrup1.mysimplecleanarch.data

import com.tiketgrup1.mysimplecleanarch.domain.Message

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = Message("Hello $name! Welcome to Clean Architecture")
}