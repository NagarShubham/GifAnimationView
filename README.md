# GifAnimationView
A simple library to run Gif file on Android.

## Integration
Step 1. Add it in your root `build.gradle` at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency in your `app/build.gradle`:

	dependencies {
	        implementation 'com.github.NagarShubham:GifAnimationView:0.1.0'
	}
	
	
## Usage
```xml
    <com.shubham.gif.library.GifAnimationView
        android:id="@+id/gifAnimationView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:gif="@raw/sample4" />
```
 	
	val gifAnimationView = findViewById<GifAnimationView>(R.id.gifAnimationView)
        gifAnimationView.gifResource = R.raw.sample1
        /**
         * @sample
         * gifAnimationView.play() To play animation gif
         * gifAnimationView.pause() To pause animation gif
         */
        gifAnimationView.play()
