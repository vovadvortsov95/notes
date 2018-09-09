package com.example.vladimirdvortsov.notes.DataBase

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.vladimirdvortsov.notes.Model.Note

@Dao
interface NoteDao {
    //return all Notes
    @Query("select * from notes")
    fun getAllNotes():List<Note>

    //in future ( when you have a lot of notes and want find some special)
    @Query("select * from notes")
    fun findNoteById(id : Int):Note

    @Query("select * from notes")
    fun findNoteByDescription(description : String) : Note

    @Insert
    fun addNote(note : Note)

    @Delete
    fun deleteNote(note : Note)

    @Delete
    fun clear(allNotes : List<Note>)
}