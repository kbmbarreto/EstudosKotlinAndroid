package br.com.lambdateam.myaccess.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: Long
) : Parcelable
