# GifAnimationView <img src="https://i.pinimg.com/originals/00/9d/d9/009dd94a954cb90091e310766e619a1a.gif" width="70" height="70"/>
A simple library to show Gif file on Android.

## Example 😍

![demo](https://im4.ezgif.com/tmp/ezgif-4-ed5a5c653c.gif)



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

``` java
val gifAnimationView = findViewById<GifAnimationView>(R.id.gifAnimationView)
	gifAnimationView.gifResource = R.raw.sample1
      	gifAnimationView.play() // also pause()
```		

# License 🔒
```
Copyright (c) 2022 Shubham Nagar

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```
See the full [licence file](https://github.com/NagarShubham/GifAnimationView/blob/main/LICENSE).
