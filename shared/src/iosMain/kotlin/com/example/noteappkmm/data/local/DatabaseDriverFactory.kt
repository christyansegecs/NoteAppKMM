package com.example.noteappkmm.data.local

import com.example.noteappkm.database.NoteDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}