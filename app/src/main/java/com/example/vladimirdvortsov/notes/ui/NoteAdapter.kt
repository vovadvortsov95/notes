package com.example.vladimirdvortsov.notes.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.vladimirdvortsov.notes.Model.Note
import com.example.vladimirdvortsov.notes.R

class NoteAdapter(var notesArray : List<Note>?) : RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NoteViewHolder {
       return NoteViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.activite_note,parent,false))
    }

    override fun getItemCount(): Int {
        return notesArray!!.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder?, position: Int){
        holder!!.bind(notesArray!![position])
    }
}