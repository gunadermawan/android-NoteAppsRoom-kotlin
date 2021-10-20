package com.gunder.mynoteappsroom.ui.insert

import android.app.Application
import com.gunder.mynoteappsroom.database.Note
import com.gunder.mynoteappsroom.repository.NoteRepostiory

class NoteAddUpdateViewModel(application: Application) {
    private val mNoteRepostiory: NoteRepostiory = NoteRepostiory(application)

    fun insert(note: Note) {
        mNoteRepostiory.insert(note)
    }

    fun update(note: Note) {
        mNoteRepostiory.update(note)
    }

    fun delete(note: Note) {
        mNoteRepostiory.delete(note)
    }
}