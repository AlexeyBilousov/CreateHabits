package com.riard.createhabits.persistence

interface Persistence<T> {
    fun getAllItems() : List<T>
    fun getItemById(id: Int) : T
    fun insertItem(item: T)
    fun updateItem(item: T)
    fun deleteItem(item: T)
}