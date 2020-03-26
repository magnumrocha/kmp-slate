package com.magnumrocha.kmpslate.android.common_ui

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import com.magnumrocha.kmpslate.android.utils.Logger

@Suppress("LeakingThis")
abstract class BaseFrameLayout : FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    private val log = Logger.forClass(this)

    init {
        log.d("init: $this")
        val layoutToInflate = getLayout()
        if (layoutToInflate > 0) {
            LayoutInflater.from(context).inflate(layoutToInflate, this)
        }
    }

    @LayoutRes
    open fun getLayout(): Int = 0

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        log.d("$this onLayout: changed=$changed, left=$left, top=$top, right=$right, bottom=$bottom")
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        log.d("onFinishInflate: $this")
    }

    // override fun onSaveInstanceState(): Parcelable? {
    //     log.d("onSaveInstanceState: $this")
    //     return StateSaver.saveInstanceState(this, super.onSaveInstanceState())
    // }
    //
    // override fun onRestoreInstanceState(state: Parcelable) {
    //     log.d("onRestoreInstanceState: $this")
    //     super.onRestoreInstanceState(StateSaver.restoreInstanceState(this, state))
    // }

    override fun onAttachedToWindow() {
        log.d("onAttachedToWindow: $this")
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        log.d("onDetachedFromWindow: $this")
        super.onDetachedFromWindow()
    }
}
