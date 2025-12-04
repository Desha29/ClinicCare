package com.example.cliniccare.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.cliniccare.data.local.entity.DoctorEntity
import com.example.cliniccare.data.local.entity.UserEntity

data class DoctorWithUser(
    @Embedded val doctor: DoctorEntity,
    @Relation(
        parentColumn = "userId",
        entityColumn = "id"
)
    val user: UserEntity
)
