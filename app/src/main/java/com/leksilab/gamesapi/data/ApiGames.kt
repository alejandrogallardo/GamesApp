package com.leksilab.gamesapi.data

import com.leksilab.gamesapi.model.GamesModel
import com.leksilab.gamesapi.model.SingleGameModel
import com.leksilab.gamesapi.util.Constants.Companion.API_KEY
import com.leksilab.gamesapi.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGames {
    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>

    @GET("$ENDPOINT/{id}$API_KEY")
    suspend fun getGameById(@Path(value = "id")id : Int): Response<SingleGameModel>
}