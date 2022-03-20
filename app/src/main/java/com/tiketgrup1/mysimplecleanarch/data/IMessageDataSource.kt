package com.tiketgrup1.mysimplecleanarch.data

import com.tiketgrup1.mysimplecleanarch.domain.Message

interface IMessageDataSource {
    fun getMessageFromSource(name: String): Message
}