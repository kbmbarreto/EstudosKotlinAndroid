package br.com.lambdateam.myaccess.data.remote

import br.com.lambdateam.myaccess.domain.Password
import retrofit2.http.GET
import retrofit2.http.Path

interface PasswordApi {

    @GET("passwords/{id}")
    suspend fun findPasswordStatement(@Path("id") accountHolderId: Long): List<Password>
}