package com.example.cliniccare.data.repository

import com.example.cliniccare.data.local.entity.AppointmentEntity
import java.util.Date

interface Appointment {
    val appointmentEntity: AppointmentEntity

    fun newAppointment(date: Date, doctorId: Int, userId: Long)
}

