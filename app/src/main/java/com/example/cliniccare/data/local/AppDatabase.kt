package com.example.cliniccare.data.local

import androidx.room.Database
import com.example.cliniccare.data.local.entity.AppointmentEntity
import com.example.cliniccare.data.local.entity.DoctorEntity
import com.example.cliniccare.data.local.entity.SpecialityEntity
import com.example.cliniccare.data.local.entity.UserEntity

@Database(entities = [UserEntity::class, DoctorEntity::class, SpecialityEntity::class, AppointmentEntity::class], version = 1)
abstract class AppDatabase()