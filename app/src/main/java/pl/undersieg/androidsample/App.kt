package pl.undersieg.androidsample

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import pl.undersieg.androidsample.di.DaggerAppComponent
import timber.log.Timber
import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        DaggerAppComponent.builder()
            .context(this)
            .build()
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}