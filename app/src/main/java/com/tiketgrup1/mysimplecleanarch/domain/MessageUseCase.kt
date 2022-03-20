package com.tiketgrup1.mysimplecleanarch.domain

interface MessageUseCase {
    fun getMessage(name: String): Message
}