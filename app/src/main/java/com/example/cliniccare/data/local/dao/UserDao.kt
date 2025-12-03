package com.example.cliniccare.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cliniccare.data.local.entity.UserEntity

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: UserEntity)

    @Query("SELECT * FROM users WHERE name = :name AND password = :password")
    suspend fun getUser(name: String, password: String): UserEntity?

    @Update
    suspend fun updateUser(user: UserEntity)
}