package org.hariom.practicleexam.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "mynumber")
data class MyNumber(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val number: Int
)
