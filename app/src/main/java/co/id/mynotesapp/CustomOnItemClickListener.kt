package co.id.mynotesapp

import android.view.View

class CustomOnItemClickListener(
    private val position: Int,
    private val onItemClickCallback: OnItemClickCallback
) : View.OnClickListener {

    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }

    override fun onClick(p0: View?) {
        p0?.let { onItemClickCallback.onItemClicked(it, position) }
    }
}