package co.id.mynotesapp.helper

import android.database.Cursor
import co.id.mynotesapp.db.DatabaseContract
import co.id.mynotesapp.entity.Note

object MappingHelper {

    fun mapCursorToArrayList(noteCursor: Cursor?) : ArrayList<Note>{
        val noteList = ArrayList<Note>()

        noteCursor?.apply {
            while (moveToNext()){
                val id = getInt(getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID))
                val title = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumns.TITLE))
                val description = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumns.DESCRIPTION))
                val date = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumns.DATE))
                noteList.add(Note(id, title, description, date))
            }
        }
        return noteList
    }
}