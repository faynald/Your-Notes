package com.faynald.yournotes.feature_note.domain.repository

import com.faynald.yournotes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

// why using interface?
// - great for testing because this can be fake version of repository
//   they don't care the data is from where
//   they just need these data for test case

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}