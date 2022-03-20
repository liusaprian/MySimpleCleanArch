package com.tiketgrup1.mysimplecleanarch.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): Message
}