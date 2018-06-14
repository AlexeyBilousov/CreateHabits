package com.riard.createhabits.entity

data class Periodicity(var countDays: Int,
                       var countActiveDays: Int,
                       var countOneOfDay: Int,
                       var listTimes: List<Int>)
