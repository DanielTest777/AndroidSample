package pl.undersieg.androidsample.di

import dagger.Module
import dagger.Provides
import pl.undersieg.androidsample.network.PlaceholderApi
import pl.undersieg.androidsample.utils.Config
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class ApiModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Config.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    @Provides
    fun providePlaceholderApi(retrofit: Retrofit): PlaceholderApi {
        return retrofit.create(PlaceholderApi::class.java)
    }
}