package `in`.shrifoods.app.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import `in`.shrifoods.app.api.RetrofitClient
import `in`.shrifoods.app.models.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductViewModel : ViewModel() {

    var products = mutableStateListOf<Product>()

    init {
        loadProducts()
    }

    private fun loadProducts() {

        RetrofitClient.api.getProducts()
            .enqueue(object : Callback<List<Product>> {

                override fun onResponse(
                    call: Call<List<Product>>,
                    response: Response<List<Product>>
                ) {

                    Log.d("API_CODE", response.code().toString())

                    if (response.isSuccessful) {

                        response.body()?.let {

                            products.clear()
                            products.addAll(it)

                            Log.d("API_SUCCESS", it.toString())
                        }

                    } else {

                        Log.e(
                            "API_ERROR",
                            response.errorBody()?.string() ?: "Unknown Error"
                        )
                    }
                }

                override fun onFailure(
                    call: Call<List<Product>>,
                    t: Throwable
                ) {

                    Log.e("API_FAILURE", t.toString())
                }
            })
    }
}