package com.magnumrocha.kmpslate.android.app

import android.content.Context
import com.magnumrocha.kmpslate.android.AndroidApp
import com.magnumrocha.kmpslate.android.onboarding.OnboardingModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.GlobalScope

@Module
class AppModule {

    @Provides
    fun providesCoroutineContext(): CoroutineContext {
        return GlobalScope.coroutineContext
    }
}

@Component(
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        OnboardingModule::class
    ])
@Singleton
interface AppComponent : AndroidInjector<AndroidApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}
