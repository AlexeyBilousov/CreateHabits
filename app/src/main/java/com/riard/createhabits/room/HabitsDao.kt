package com.riard.createhabits.room

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
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
    fun getHabitById(id: Int) : Habit

    @Update
    fun update(habit: Habit)
}