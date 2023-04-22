package com.petrrr33.notes.domain.note

import com.petrrr33.notes.presentation.*
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long,
    val title: String,
    val content: String,
    val colorHex: Long,
    val createdAt: LocalDateTime
) {
    companion object{
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }

}

