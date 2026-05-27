package `in`.shrifoods.app.api

import `in`.shrifoods.app.models.Product
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("api/ProductApi")
    fun getProducts(): Call<List<Product>>
}