package com.riard.createhabits.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "habits")
data class Habit(@PrimaryKey(autoGenerate = true) var id: Int,
                 var name: String,
                 var question: String,
                 var color: Int,
                 var listHabitsByAllTime: HashMap<String, Boolean>,
                 var periodicity: Periodicity,
                 var isNotification: Boolean)





