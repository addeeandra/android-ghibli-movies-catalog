package me.inibukanadit.ghibliapi.remote.response

import com.google.gson.annotations.SerializedName

data class SpeciesData(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("classification")
	val classification: String? = null,

	@field:SerializedName("eye_colors")
	val eyeColors: String? = null,

	@field:SerializedName("hair_colors")
	val hairColors: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("people")
	val people: List<String?>? = null,

	@field:SerializedName("films")
	val films: List<String?>? = null

)