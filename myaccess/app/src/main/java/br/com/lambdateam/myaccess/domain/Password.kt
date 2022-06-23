package br.com.lambdateam.myaccess.domain

data class Password(
    val id: Long,
    val description: String,
    val url: String,
    val userName: String,
    val password: String,
    val notes: String,
    //TODO: Mapear idUser -> idPassword
    val idUser: Long?
)
