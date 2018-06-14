package com.riard.createhabits.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.riard.createhabits.entity.Habit

@Dao
interface HabitsDao {

    @Insert
    fun insert(habit: Habit)

    @Delete
    fun delete(habit: Habit)

    @Query("select * from habits")
    fun getListHabits() : List<Habit>

    @Query("select * from habits where id= :id")
    fun getHabitById(id: Long) : Habit

}