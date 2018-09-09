package com.example.vladimirdvortsov.notes.Model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import  android.arch.persistence.room.PrimaryKey

@Entity(tableName = "notes")
class Note(
        @PrimaryKey @ColumnInfo(name = "id") var id: Int,
        @ColumnInfo(name = "description") var Description: String,
        @ColumnInfo(name = "note_text") var noteText: String?)
