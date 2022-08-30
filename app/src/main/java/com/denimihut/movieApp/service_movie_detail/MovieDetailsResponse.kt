package com.denimihut.movieApp.service_movie_detail

import com.google.gson.annotations.SerializedName

data class MovieDetailsResponse(
    var id: Int,
    var title: String,
    @SerializedName("backdrop_path") var backdropPath: String?,
    var overview: String,
    @SerializedName("poster_path") var posterPath: String?,
    @SerializedName("release_date") var releaseDate: String,
    var videos: VideosList?
)