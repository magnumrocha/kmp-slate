package com.magnumrocha.kmpslate.android.common_ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StringRes
import com.magnumrocha.kmpslate.android.R
import kotlinx.android.synthetic.main.view_empty_state.view.*

class EmptyStateView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : BaseFrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    override fun getLayout() = R.layout.view_empty_state

    fun setTitle(@StringRes textResId: Int) = setTitle(context.getString(textResId))

    fun setTitle(text: String?) {
        empty_state_title.text = text
        empty_state_title.visibility = if (!text.isNullOrEmpty()) View.VISIBLE else View.GONE
    }

    fun setMessage(@StringRes textResId: Int) = setMessage(context.getString(textResId))

    fun setMessage(text: String?) {
        empty_state_message.text = text
        empty_state_message.visibility = if (!text.isNullOrEmpty()) View.VISIBLE else View.GONE
    }

    fun clearMessage() = setMessage(null)
}