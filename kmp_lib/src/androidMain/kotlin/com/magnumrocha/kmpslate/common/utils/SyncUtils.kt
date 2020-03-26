package com.magnumrocha.kmpslate.common.utils

class SyncObject {
    inline operator fun <A> invoke(block: () -> A): A = synchronized(this) { block() }
}
