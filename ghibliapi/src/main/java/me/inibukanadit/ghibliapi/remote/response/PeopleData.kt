package me.inibukanadit.ghibliapi.remote.response

import com.google.gson.annotations.SerializedName

data class PeopleData(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("gender")
	val gender: String? = null,

	@field:SerializedName("age")
	val age: String? = null,

	@field:SerializedName("eye_color")
	val eyeColor: String? = null,

	@field:SerializedName("hair_color")
	val hairColor: String? = null,

	@field:SerializedName("films")
	val films: List<String>? = null,

	@field:SerializedName("species")
	val species: String? = null,

	@field:SerializedName("url")
	val url: String? = null

)