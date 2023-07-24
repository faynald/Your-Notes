package com.faynald.yournotes.feature_note.presentation.add_edit_note

// because we use custom text field here, we need this state
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
