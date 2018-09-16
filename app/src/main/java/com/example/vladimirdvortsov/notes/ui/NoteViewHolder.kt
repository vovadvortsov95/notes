package com.example.vladimirdvortsov.notes.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.vladimirdvortsov.notes.Model.Note
import kotlinx.android.synthetic.main.activite_note.view.*
import java.util.*

class NoteViewHolder(itemView : View) : RecyclerView.ViewHolder( itemView ){
    fun bind(note : Note){
        // val -> R.id. <name>
        itemView.description.text = note.Description
        itemView.textNote.text = note.noteText
        itemView.currentDate.text = Calendar.SECOND.toString()
       // itemView.val.text = //CurrentDate
    }

}