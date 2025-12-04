package com.example.cliniccare.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "doctors",
    foreignKeys = [ForeignKey(
        entity = UserEntity::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )])
data class DoctorEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val speciality: String,
    val userId: Long
)
