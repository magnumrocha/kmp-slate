package com.magnumrocha.kmpslate.common.utils

sealed class Optional<out T> {

    /**
     * Converts [Optional] to either its non-null value if it's [Some] or `null` if it's [None].
     */
    abstract fun toNullable(): T?
}

data class Some<out T>(val value: T) : Optional<T>() {
    override fun toString() = "Some($value)"
    override fun toNullable(): T = value
}

object None : Optional<Nothing>() {
    override fun toString() = "None"

    override fun toNullable(): Nothing? = null
}

/**
 * Wraps an instance of T (or null) into an [Optional]:
 *
 * ```kotlin
 * val a: String? = "str"
 * val b: String? = null
 *
 * val optionalA = a.toOptional() // Some("str")
 * val optionalB = b.toOptional() // None
 * ```
 *
 * This is the preferred method of obtaining an instance of [Optional] in Kotlin. In Java, prefer
 * using the static [Optional.toOptional] method.
 */
fun <T> T?.toOptional(): Optional<T> = if (this == null) None else Some(this)
