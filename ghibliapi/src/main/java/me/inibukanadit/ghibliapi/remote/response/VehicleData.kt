package me.inibukanadit.ghibliapi.remote.response

import com.google.gson.annotations.SerializedName

data class VehicleData(

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("vehicle_class")
    val vehicleClass: String? = null,

    @field:SerializedName("length")
    val length: String? = null,

    @field:SerializedName("pilot")
    val pilot: String? = null,

    @field:SerializedName("films")
    val films: String? = null,

    @field:SerializedName("url")
    val url: String? = null

)