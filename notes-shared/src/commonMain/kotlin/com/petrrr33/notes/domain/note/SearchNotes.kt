package com.petrrr33.notes.domain.note

import com.petrrr33.notes.domain.time.DateTimeUtil

class SearchNotes {

    fun execute(notes: List<Note>, query: String): List<Note> {
        if (query.isBlank()) return notes

        return notes.filter {
            it.content.trim().lowercase().contains(query.lowercase()) || it.title.trim().lowercase()
                .contains(query)
        }.sortedBy { DateTimeUtil.toEpochMillis(it.createdAt) }

    }
}