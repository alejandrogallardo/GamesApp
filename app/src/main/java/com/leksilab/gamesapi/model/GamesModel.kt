package com.leksilab.gamesapi.model

data class GamesModel(
    val count: Int,
    val results: List<GameList>
)

/*data class GameList(
    val id: Int,
    val codigo: String,
    val descripcion: String
)*/

data class GameList(
    val id: Int,
    val name: String,
    val background_image: String
)
