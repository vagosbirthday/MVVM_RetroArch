package com.personal.mx.motivational_app.model

class QuoteRepository {
    private val api = RetrofitInstance.api

    suspend fun fetchQuote(): QuoteResponse {
        return api.getQuote().first() // API returns a list; we take the first item
    }
}
