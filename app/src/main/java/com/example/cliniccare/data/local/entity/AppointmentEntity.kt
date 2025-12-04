package com.example.cliniccare.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "appointments",
    foreignKeys = [
            ForeignKey(
                entity = DoctorEntity::class,
                parentColumns = ["id"],
                childColumns = ["doctorId"],
                onDelete = ForeignKey.CASCADE
            ), ForeignKey(
                entity = UserEntity::class,
                parentColumns = ["id"],
                childColumns = ["userId"],
                onDelete = ForeignKey.CASCADE
            )])
data class AppointmentEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val Date: Long,
    val doctorId: Int,
    val userId: Long
)
