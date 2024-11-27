package com.personal.mx.motivational_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.personal.mx.motivational_app.model.QuoteRepository
import com.personal.mx.motivational_app.model.QuoteResponse
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = QuoteRepository()

    // LiveData to observe in the Activity
    val quote = MutableLiveData<QuoteResponse>()
    val error = MutableLiveData<String>()

    // Function to fetch a new quote
    fun fetchQuote() {
        viewModelScope.launch {
            try {
                val result = repository.fetchQuote()
                quote.postValue(result)
            } catch (e: Exception) {
                error.postValue("Failed to fetch quote: ${e.message}")
            }
        }
    }
}
