package com.example.cliniccare.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey() val id: Long,
    val name: String,
    val password: String,
    val email: String,
    val role: String
)
