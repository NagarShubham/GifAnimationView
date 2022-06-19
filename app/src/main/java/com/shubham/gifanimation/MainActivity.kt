package com.shubham.gifanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shubham.gif.library.GifAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gifAnimationView = findViewById<GifAnimationView>(R.id.gifAnimationView)
        gifAnimationView.gifResource = R.raw.sample1
        /**
         * @sample
         * gifAnimationView.play() To play animation gif
         * gifAnimationView.pause() To pause animation gif
         */
        gifAnimationView.play()
    }
}