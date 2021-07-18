package com.example.geekhavenproject

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao) {
    // we can this data through Database, Network call, APIs etc.
    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }
    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }
}