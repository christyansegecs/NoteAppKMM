package com.example.noteappkmm.di

import com.example.noteappkm.database.NoteDatabase
import com.example.noteappkmm.data.local.DatabaseDriverFactory
import com.example.noteappkmm.data.note.SqlDelightNoteDataSource
import com.example.noteappkmm.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}