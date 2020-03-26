package com.magnumrocha.kmpslate.common

import platform.objc.objc_sync_enter
import platform.objc.objc_sync_exit

fun synced(lock: Any, closure: () -> Unit) {
    objc_sync_enter(lock)
    closure()
    objc_sync_exit(lock)
}
