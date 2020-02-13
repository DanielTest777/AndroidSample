package pl.undersieg.androidsample.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.undersieg.androidsample.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}