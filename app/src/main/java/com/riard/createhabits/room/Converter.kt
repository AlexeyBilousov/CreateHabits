package com.riard.createhabits.room

import android.arch.persistence.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.riard.createhabits.entity.Periodicity

class Converter {

    @TypeConverter
    fun toPeriodicity(periodicity: String) : Periodicity = Gson().fromJson(periodicity,
            object : TypeToken<Periodicity>() {}.type)

    @TypeConverter
    fun toListInt(listTimes: String) : List<Int> = Gson().fromJson(listTimes, object :
            TypeToken<List<Int>>() {}.type)

    @TypeConverter
    fun toHashMap(hashMap: String) : HashMap<String, Boolean> = Gson().fromJson(hashMap,
            object : TypeToken<HashMap<String, Boolean>>() {}.type)

    @TypeConverter
    fun fromPeriodicity(periodicity: Periodicity) : String = Gson().toJson(periodicity)

    @TypeConverter
    fun fromListInt(listInt: List<Int>) : String = Gson().toJson(listInt)

    @TypeConverter
    fun fromHashMap(hashMap: HashMap<String, Boolean>) : String = Gson().toJson(hashMap)

}