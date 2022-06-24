package br.com.lambdateam.myaccess.data

import android.util.Log
import androidx.lifecycle.liveData
import br.com.lambdateam.myaccess.data.remote.PasswordApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception

object PasswordRepository {

    private val TAG = javaClass.simpleName

    private val restApi by lazy{
        Retrofit.Builder()
            .baseUrl("http://192.168.15.24:8001/myaccess/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PasswordApi::class.java)
    }

    fun findPasswordStatement(accountHolderId: Long) = liveData {
        emit(State.Wait)
        try {
            emit(State.Success(data = restApi.findPasswordStatement(accountHolderId)))
        } catch (e: Exception) {
            Log.e(TAG, e.message, e)
            emit(State.Error(e.message))
        }
    }
}