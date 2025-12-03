package com.example.cliniccare.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.cliniccare.data.local.entity.AppointmentEntity
import com.example.cliniccare.data.local.entity.UserEntity

data class UserWithAppointments(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val appointments: List<AppointmentEntity>
)
