package com.magnumrocha.kmpslate.android.onboarding

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Dagger module for the Onboarding feature.
 */
@Module
abstract class OnboardingModule {

    @ContributesAndroidInjector(modules = [ViewModelInjectorModule::class])
    abstract fun injectionWelcomeFragment(): WelcomeFragment

    @Module
    class ViewModelInjectorModule {
/*
        @Provides
        fun provideViewModelFactory(settings: UserSettings): ViewModelProvider.Factory =
            ViewModelFactory(appRepository)

        @Provides
        fun provideOnboardingViewModel(
            factory: ViewModelProvider.Factory,
            target: WelcomeFragment
        ): OnboardingViewModel =
            ViewModelProvider(target, factory).get(OnboardingViewModel::class.java)
*/
    }
/*
    class ViewModelFactory(
        private val userSettings: UserSettings
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return OnboardingViewModel(userSettings) as T
        }
    }
*/
}
