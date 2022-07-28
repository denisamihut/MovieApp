package com.example.movieapp.ui.movies

import androidx.room.*

@Dao
interface MoviesDAO {
    @Query("SELECT * FROM movies")
    fun getAll(): List<Movies>

    @Insert
    fun save(movie: Movies)

    @Insert
    fun saveAll(movies: List<Movies>)

    @Delete
    fun delete(movie: Movies)

    @Delete
    fun deleteAll(movies: List<Movies>)

    @Query("DELETE FROM movies")
    fun deleteAll()

    @Transaction
    fun replaceAll(movies: List<Movies>) {
        deleteAll()
        saveAll(movies)
    }

    @Query("SELECT COUNT(id) FROM movies")
    fun getCount() : Int
}