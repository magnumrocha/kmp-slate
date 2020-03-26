package com.magnumrocha.kmpslate.android

import com.magnumrocha.kmpslate.android.app.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AndroidApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.factory().create(applicationContext)

    override fun onCreate() {
        super.onCreate()
    }
}
