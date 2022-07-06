package org.hariom.practicleexam.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.hariom.practicleexam.repository.NumberRepository

class NumberViewFactory(private val repository: NumberRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NumberViewModel(repository) as T
    }
}