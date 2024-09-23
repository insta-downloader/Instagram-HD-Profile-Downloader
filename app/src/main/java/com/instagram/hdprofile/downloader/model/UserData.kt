package com.instagram.hdprofile.downloader.model

import com.google.gson.annotations.SerializedName
import com.instagram.hdprofile.downloader.model.story.User
import java.io.Serializable

data class UserData(@SerializedName("user") val user: User?) : Serializable
