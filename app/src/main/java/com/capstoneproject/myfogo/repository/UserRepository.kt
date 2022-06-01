package com.capstoneproject.myfogo.repository

import com.capstoneproject.myfogo.data.model.Login
import com.capstoneproject.myfogo.data.model.LoginResponse
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    /*suspend fun registerUser(registerBody: Register): FileUploadResponse*/

    suspend fun loginUser(loginBody: Login): LoginResponse

    suspend fun logoutUser()

    val userToken: Flow<String>

    suspend fun getUserToken(): String

    suspend fun setUserToken(token: String)
}