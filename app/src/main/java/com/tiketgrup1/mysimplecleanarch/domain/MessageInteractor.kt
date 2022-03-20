package com.tiketgrup1.mysimplecleanarch.domain

class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): Message {
        return messageRepository.getWelcomeMessage(name)
    }
}