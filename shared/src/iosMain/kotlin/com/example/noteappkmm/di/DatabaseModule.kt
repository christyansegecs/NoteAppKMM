package com.example.noteappkmm.di

import com.example.noteappkm.data.local.DatabaseDriverFactory
import com.example.noteappkm.data.note.SqlDelightNoteDataSource
import com.example.noteappkm.database.NoteDatabase
import com.example.noteappkm.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}