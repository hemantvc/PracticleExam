package org.hariom.practicleexam.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.hariom.practicleexam.model.MyNumber


@Database(entities = [MyNumber::class], version = 1)
abstract class AppDb : RoomDatabase(){

    abstract fun numberDao() : NumberDao

    companion object{
        @Volatile
        private var INSTANCE : AppDb? = null

        fun getDatabase(context: Context) : AppDb {
            if(INSTANCE == null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context,AppDb::class.java,
                        "appDB").build()
                }
            }
            return  INSTANCE!!
        }
    }
}