package org.hariom.practicleexam

import android.app.Application
import org.hariom.practicleexam.db.AppDb
import org.hariom.practicleexam.repository.NumberRepository

class App : Application() {
    lateinit var numberRepository: NumberRepository
    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val dataBase = AppDb.getDatabase(applicationContext)
        numberRepository = NumberRepository(dataBase)
    }
}