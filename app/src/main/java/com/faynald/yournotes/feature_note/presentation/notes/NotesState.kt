package com.faynald.yournotes.feature_note.presentation.notes

import com.faynald.yournotes.feature_note.domain.model.Note
import com.faynald.yournotes.feature_note.domain.util.NoteOrder
import com.faynald.yournotes.feature_note.domain.util.OrderType

// State for UI
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
