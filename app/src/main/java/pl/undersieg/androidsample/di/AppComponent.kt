package pl.undersieg.androidsample.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import pl.undersieg.androidsample.App
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApiModule::class,
        ActivityModule::class,
        AndroidInjectionModule::class]
)
interface AppComponent {

    fun inject(application: App)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }
}