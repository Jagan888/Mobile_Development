package com.example.bookfilter2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun InsertBooks(bookdetails: BookDetail)
    @Query("Delete From BooksDetail")
    suspend fun DeleteBook()
}