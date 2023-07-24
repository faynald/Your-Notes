package com.faynald.yournotes.feature_note.domain.use_case

// this will be the class that we will inject into our viewModel
// this contains every use case
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
