package pl.undersieg.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection.inject
import pl.undersieg.androidsample.network.PlaceholderApi
import timber.log.Timber
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var placeholderApi: PlaceholderApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject(this)

    }
}
