package org.hariom.practicleexam.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.hariom.practicleexam.db.AppDb
import org.hariom.practicleexam.model.MyNumber
import org.hariom.practicleexam.model.NumberList

class NumberRepository (private val appDb: AppDb){
    private val numberLiveData = MutableLiveData<NumberList>()

    val numbers : LiveData<NumberList>
        get() = numberLiveData


    suspend fun addNumbers(numbers: List<MyNumber>){
            appDb.numberDao().addNumbers(numbers)
    }

    suspend fun getNumbers(){
        appDb.numberDao().getNumber()
    }

}