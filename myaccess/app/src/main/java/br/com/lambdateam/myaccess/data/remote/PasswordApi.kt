package br.com.lambdateam.myaccess.data.remote

import br.com.lambdateam.myaccess.domain.Password
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PasswordApi {

    @GET("passwords")
    suspend fun findPasswordStatement(): Response<List<Password>>
}