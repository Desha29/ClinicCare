package com.example.cliniccare.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cliniccare.data.local.dao.AppointmentDao
import com.example.cliniccare.data.local.dao.DoctorDao
import com.example.cliniccare.data.local.dao.UserDao
import com.example.cliniccare.data.local.entity.AppointmentEntity
import com.example.cliniccare.data.local.entity.DoctorEntity
import com.example.cliniccare.data.local.entity.UserEntity

@Database(entities = [UserEntity::class, DoctorEntity::class, AppointmentEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun doctorDao(): DoctorDao
    abstract fun appointmentDao(): AppointmentDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                    ).build().also { INSTANCE = it }
            } } } }