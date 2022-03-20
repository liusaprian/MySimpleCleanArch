package com.tiketgrup1.mysimplecleanarch.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tiketgrup1.mysimplecleanarch.domain.Message
import com.tiketgrup1.mysimplecleanarch.domain.MessageUseCase

class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<Message>()
    val message: LiveData<Message>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}