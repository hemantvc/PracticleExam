package org.hariom.practicleexam.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.hariom.practicleexam.model.MyNumber
import org.hariom.practicleexam.model.NumberList
import org.hariom.practicleexam.repository.NumberRepository

class NumberViewModel(private val repository: NumberRepository) : ViewModel(){

    init {

        viewModelScope.launch(Dispatchers.IO) {
            repository.getNumbers()
        }

    }


    val numbers: LiveData<NumberList>
        get() = repository.numbers



     fun addNumber(numbers : List<MyNumber>){
         viewModelScope.launch(Dispatchers.IO) {
             repository.addNumbers(numbers)
         }
    }

}