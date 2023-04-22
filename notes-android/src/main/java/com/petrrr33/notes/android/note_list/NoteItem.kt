package com.petrrr33.notes.android.note_list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.petrrr33.notes.domain.note.Note


@Composable
fun NoteItem(
    note: Note,
    backgroundColor: Color,
    onNoteClick: () -> Unit,
    onDeleteNote: () -> Unit,
    modifier: Modifier = Modifier
) {


}