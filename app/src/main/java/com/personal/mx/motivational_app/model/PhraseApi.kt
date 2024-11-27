package com.personal.mx.motivational_app.model

import retrofit2.http.GET

interface PhraseApi {
    @GET("random") // Endpoint for random quotes
    suspend fun getQuote(): List<QuoteResponse>
}
