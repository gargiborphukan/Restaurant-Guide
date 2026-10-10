package ca.gbc.comp3074.diamantino_nicole.restaurantguide.model


data class Restaurant(
    val restaurantId: Long = 0L,
    val name: String = "",
    val address: String = "",
    val phoneNo: String = "",
    val description: String = "",
    val tags: String = "",
    val rating: Float = 0f
)
