package com.riard.createhabits.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.riard.createhabits.entity.Habit

@Database(entities = arrayOf(Habit::class), version = 1)
@TypeConverters(Converter::class)
abstract class HabitsRoomDatabase : RoomDatabase() {

    abstract fun habitsDao(): HabitsDao

    companion object {
        private var INSTANCE: HabitsRoomDatabase? = null

        fun getInstance(context: Context): HabitsRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(HabitsRoomDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            HabitsRoomDatabase::class.java, "create_habits.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}