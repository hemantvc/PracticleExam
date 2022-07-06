package org.hariom.practicleexam.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import org.hariom.practicleexam.model.MyNumber
@Dao
interface NumberDao{

    @Insert
    fun addNumbers(numbers : List<MyNumber>)

    @Query("SELECT * FROM mynumber")
    suspend fun getNumber() : List<MyNumber>
}
