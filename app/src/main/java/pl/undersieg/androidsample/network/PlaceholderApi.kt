package pl.undersieg.androidsample.network

import retrofit2.http.GET


interface PlaceholderApi {

    //TODO
    @GET("/photos")
    fun fetchList(): List<Any>
}