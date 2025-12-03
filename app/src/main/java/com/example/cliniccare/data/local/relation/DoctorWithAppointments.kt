package com.example.cliniccare.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.cliniccare.data.local.entity.AppointmentEntity
import com.example.cliniccare.data.local.entity.DoctorEntity

data class DoctorWithAppointments(
    @Embedded val doctor: DoctorEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "doctorId"
    )
    val appointments: List<AppointmentEntity>
)
