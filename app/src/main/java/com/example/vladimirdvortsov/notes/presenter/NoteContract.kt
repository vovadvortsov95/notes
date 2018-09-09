package com.example.vladimirdvortsov.notes.presenter

interface NoteContract{

    interface NoteView {
        fun showAllNotes()
        fun showSingleNote()
    }

    interface NotePresenter {
        fun findNote()
        fun addNote()
        fun deleteNote()
        fun onNoteClick()
    }
}