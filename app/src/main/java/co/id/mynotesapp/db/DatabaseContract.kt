package co.id.mynotesapp.db

import android.net.Uri
import android.provider.BaseColumns

object DatabaseContract {

    const val AUTHORITY = "co.id.mynotesapp"
    const val SCHEME = "content"

    class NoteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"

            //buat uri
            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build()
        }
    }

}