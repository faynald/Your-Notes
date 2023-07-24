package com.faynald.yournotes.feature_note.domain.use_case

import com.faynald.yournotes.feature_note.domain.model.InvalidNoteException
import com.faynald.yournotes.feature_note.domain.model.Note
import com.faynald.yournotes.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        // check if field not empty here
        // business logic doesn't belong in the viewModel
        // here we want to tell the ui, the title is blank
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}