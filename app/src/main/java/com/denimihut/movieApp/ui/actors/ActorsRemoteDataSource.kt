package com.denimihut.movieApp.ui.actors

import com.denimihut.movieApp.network.executeAndDeliver
import com.denimihut.movieApp.ui.genres.Genres
import com.denimihut.movieApp.utils.Constants.API_KEY
import com.denimihut.movieApp.utils.Constants.LANGUAGE
import retrofit2.Retrofit

class ActorsRemoteDataSource(retrofit: Retrofit) {
    private val apiService: ActorsAPIService = retrofit.create(ActorsAPIService::class.java)
    private val actorMapper = ActorsMapper()

    fun getActors(): List<Actors> {
        return apiService.getActors(API_KEY, LANGUAGE)
            .executeAndDeliver()
            .actors
            .map { actorMapper.map(it) }
    }


    fun getSearchedActors(query: String): List<Actors> {
        return apiService.getSearchedActors(API_KEY, LANGUAGE, query)
            .executeAndDeliver()
            .actors
            .map { actorMapper.map(it) }
    }
}