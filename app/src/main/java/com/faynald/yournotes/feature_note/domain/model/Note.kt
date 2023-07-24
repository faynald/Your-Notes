package com.faynald.yournotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.faynald.yournotes.ui.theme.BabyBlue
import com.faynald.yournotes.ui.theme.LightGreen
import com.faynald.yournotes.ui.theme.RedOrange
import com.faynald.yournotes.ui.theme.RedPink
import com.faynald.yournotes.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    // create hard coded list of colors for notes
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)