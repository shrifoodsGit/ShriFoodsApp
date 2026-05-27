package `in`.shrifoods.app.repository

import `in`.shrifoods.app.api.RetrofitClient
class ProductRepository {

    suspend fun getProducts() =
        RetrofitClient.api.getProducts()
}