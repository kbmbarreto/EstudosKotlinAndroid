package br.com.lambdateam.myaccess.domain

import com.google.gson.annotations.SerializedName

data class Password(
    val id: Long,
    val description: String,
    val url: String,
    val userName: String,
    val password: String,
    val notes: String
//    //Mapear idUser -> idPassword
//    @SerializedName("username")
//    val username: String
)
