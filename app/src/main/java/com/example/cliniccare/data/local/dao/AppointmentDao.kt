package com.example.cliniccare.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.cliniccare.data.local.entity.AppointmentEntity

@Dao
interface AppointmentDao {
    @Insert
    suspend fun insertAppointment(appointment: AppointmentEntity)

    @Query("SELECT * FROM appointments WHERE doctorId = :doctorId")
    suspend fun getAppointmentsByDoctorId(doctorId: Int): List<AppointmentEntity>

    @Query("SELECT * FROM appointments WHERE userId = :userId")
    suspend fun getAppointmentsByUserId(userId: Long): List<AppointmentEntity>

    @Update
    suspend fun updateAppointment(appointment: AppointmentEntity)
}