package com.gunder.mynoteappsroom.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.gunder.mynoteappsroom.database.Note
import com.gunder.mynoteappsroom.database.NoteDao
import com.gunder.mynoteappsroom.database.NoteRoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class NoteRepostiory(application: Application) {
    private val mNoteDao: NoteDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = NoteRoomDatabase.getDatabase(application)
        mNoteDao = db.noteDao()
    }

    fun getAllNotes(): LiveData<List<Note>> = mNoteDao.getAllNotes()

    fun insert(note: Note) {
        executorService.execute { mNoteDao.insert(note) }
    }

    fun delete(note: Note) {
        executorService.execute { mNoteDao.delete(note) }
    }

    fun update(note: Note) {
        executorService.execute { mNoteDao.update(note) }
    }
}