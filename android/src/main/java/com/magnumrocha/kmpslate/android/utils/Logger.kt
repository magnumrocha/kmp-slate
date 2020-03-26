package com.magnumrocha.kmpslate.android.utils

import android.util.Log
import com.magnumrocha.kmpslate.android.BuildConfig

/**
 * Wrapper class for use Android Log utility on App.
 *
 * Created by magnumrocha on 09-12-2019.
 */
class Logger private constructor(private val tag: String? = "[UNKNOWN]", private val isEnabled: Boolean) {
    companion object {
        fun forClass(clazz: Any, enabled: Boolean = true): Logger =
            Logger(clazz::class::simpleName.get(), enabled)
        fun forTag(tag: String, enabled: Boolean = true): Logger =
            Logger(tag, enabled)
    }

    /**
     * Debug log messages.
     *
     * @param message The message to log on Android Logcat.
     * @param exception An Exception instance to log.
     */
    fun d(message: String, exception: Throwable? = null) {
        if (shouldLog(message)) {
            if (exception != null) Log.d(tag, message, exception)
            else Log.d(tag, message)
        }
    }

    /**
     * Verbose log messages.
     *
     * @param message The message to log on Android Logcat.
     * @param exception An Exception instance to log.
     */
    fun v(message: String, exception: Throwable? = null) {
        if (shouldLog(message)) {
            if (exception != null) Log.v(tag, message, exception)
            else Log.v(tag, message)
        }
    }

    /**
     * Info log messages.
     *
     * @param message The message to log on Android Logcat.
     * @param exception An Exception instance to log.
     */
    fun i(message: String, exception: Throwable? = null) {
        if (shouldLog(message)) {
            if (exception != null) Log.i(tag, message, exception)
            else Log.i(tag, message)
        }
    }

    /**
     * Warning log messages.
     *
     * @param message The message to log on Android Logcat.
     * @param exception An Exception instance to log.
     */
    fun w(message: String, exception: Throwable? = null) {
        if (shouldLog(message)) {
            if (exception != null) Log.w(tag, message, exception)
            else Log.w(tag, message)
        }
    }

    /**
     * Error log messages.
     *
     * @param message The message to log on Android Logcat.
     * @param exception An Exception instance to log.
     */
    fun e(message: String, exception: Throwable? = null) {
        if (shouldLog(message)) {
            if (exception != null) Log.e(tag, message, exception)
            else Log.e(tag, message)
        }
    }

    /**
     * Error log for [Throwable].
     *
     * @param exception An Exception instance to log.
     */
    fun e(exception: Throwable) {
        if (shouldLog(exception)) {
            Log.e(tag, exception.message ?: "", exception)
        }
    }

    private fun shouldLog(obj: Any?): Boolean = isEnabled && BuildConfig.DEBUG && obj != null
}
