package com.gunder.mynoteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gunder.mynoteappsroom.database.Note
import com.gunder.mynoteappsroom.repository.NoteRepostiory

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepostiory: NoteRepostiory = NoteRepostiory(application)
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepostiory.getAllNotes()
}