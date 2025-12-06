package com.example.cliniccare.data.repository

interface AuthenticationServices {
    fun checkEmail(email: String): Boolean
    fun checkPassword(password: String): Boolean

}