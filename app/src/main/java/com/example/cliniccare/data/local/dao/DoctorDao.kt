package com.example.cliniccare.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cliniccare.data.local.entity.DoctorEntity

@Dao
interface DoctorDao {
    @Insert
    suspend fun insertDoctor(doctor: DoctorEntity)

    @Query("SELECT * FROM doctors WHERE id = :id")
    suspend fun getDoctorById(id: Long): DoctorEntity?

    @Query("SELECT * FROM doctors WHERE speciality = :speciality")
    suspend fun getDoctorsBySpeciality(speciality: String): List<DoctorEntity>
}
