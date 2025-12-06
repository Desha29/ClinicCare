package com.example.cliniccare.data.repository

import com.example.cliniccare.data.local.entity.DoctorEntity

interface Doctor {
    val doctorEntity: DoctorEntity

    fun newDoctor(name: String, speciality: String, email: String, password: String)
}


