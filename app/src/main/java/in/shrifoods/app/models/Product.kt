package `in`.shrifoods.app.models

import com.google.gson.annotations.SerializedName

data class Product(

    @SerializedName("productId")
    val productId: Int,

    @SerializedName("productUniqueId")
    val productUniqueId: String?,

    @SerializedName("productName")
    val productName: String?,

    @SerializedName("productWeight")
    val productWeight: String?,

    @SerializedName("productPrice")
    val productPrice: Double,

    @SerializedName("productImagePath")
    val productImagePath: String?,

    @SerializedName("productDescription")
    val productDescription: String?,

    @SerializedName("productQty")
    val productQty: String?,

    @SerializedName("productRating")
    val productRating: String?,

    @SerializedName("productCategory")
    val productCategory: String?
)