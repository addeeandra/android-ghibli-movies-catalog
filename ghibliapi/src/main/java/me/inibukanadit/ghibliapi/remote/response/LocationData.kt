package me.inibukanadit.ghibliapi.remote.response

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class LocationData(

	@field:SerializedName("films")
	val films: List<String?>? = null,

	@field:SerializedName("surface_water")
	val surfaceWater: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("residents")
	val residents: List<String?>? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("climate")
	val climate: String? = null,

	@field:SerializedName("terrain")
	val terrain: String? = null,

	@field:SerializedName("url")
	val url: List<String?>? = null
)