package com.petrrr33.notes.data.note

import com.petrrr33.notes.domain.note.Note
import com.petrrr33.notes.domain.note.NoteDataSource
import com.petrrr33.notes.domain.time.DateTimeUtil
import com.plcoding.noteappkmm.database.NoteDatabase

class SqlDelightNoteDataSource(db: NoteDatabase) : NoteDataSource {

    private val queries = db.noteQueries

    override suspend fun insertNote(note: Note) {
        queries.insertUpdateNote(
            id = note.id,
            title = note.title,
            content = note.content,
            colorHex = note.colorHex,
            timestamp = DateTimeUtil.toEpochMillis(note.createdAt)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        return queries.getNoteById(id).executeAsOneOrNull()?.toNote()
    }

    override suspend fun getAllNotes(): List<Note> {
        return queries.getAllNotes().executeAsList().map { it.toNote() }
    }

    override suspend fun deleteNoteById(id: Long) {
        return queries.deleteNoteById(id)
    }
}