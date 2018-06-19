package com.riard.createhabits.room

import android.content.Context
import com.riard.createhabits.entity.Habit
import com.riard.createhabits.persistence.Persistence

class PersistenceHabitRoom(context: Context) : Persistence<Habit> {
    private val dao: HabitsDao = HabitsRoomDatabase.getInstance(context)!!.habitsDao()

    override fun getAllItems(): List<Habit> = dao.getListHabits()

    override fun getItemById(id: Int): Habit = dao.getHabitById(id)

    override fun insertItem(item: Habit) = dao.insert(item)

    override fun updateItem(item: Habit) = dao.update(item)

    override fun deleteItem(item: Habit) = dao.delete(item)

}