package com.petrrr33.notes.data.note

import com.petrrr33.notes.domain.note.Note
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote(): Note {
    return Note(
        this.id,
        this.title,
        this.content,
        this.colorHex,
        Instant.fromEpochMilliseconds(this.timestamp).toLocalDateTime(TimeZone.currentSystemDefault())
    )
}