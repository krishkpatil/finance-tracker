package com.example.financetracker

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)val id: Int,
    val label:String,
    val amount: Double,
    val descirption: String): Serializable {
}