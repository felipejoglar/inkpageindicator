# InkPageIndicator
[![Build](https://github.com/fjoglar/InkPageIndicator/workflows/Build/badge.svg)](https://github.com/fjoglar/InkPageIndicator/actions?query=workflow%3A%22Build%22)
[![Download](https://api.bintray.com/packages/fjoglar/android/inkpageindicator/images/download.svg)](https://bintray.com/fjoglar/android/inkpageindicator/_latestVersion)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://developer.android.com/studio/releases/platforms#5.0)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/fjoglar/InkPageIndicator/blob/master/LICENSE)

An ink inspired widget for indicating pages in a ViewPager2.

InkPageIndicator from [Plaid](https://github.com/nickbutcher/plaid) by [@nickbutcher](https://github.com/nickbutcher).
Migrated to 100% Kotlin.

## Installation
**Using Gradle**
```gradle
dependencies {
    implementation 'com.fjoglar.inkpageindicator:inkpageindicator:<latest-version>'
}
```

**Using Maven**

```maven
<dependency>
  <groupId>com.fjoglar.inkpageindicator</groupId>
  <artifactId>inkpageindicator</artifactId>
  <version><latest-version></version>
  <type>pom</type>
</dependency>
```

## How to use
Add `InkPageIndicator` to your XML layout alongside a `ViewPager2`.

```xml
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/view_pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <com.fjoglar.inkpageindicator.InkPageIndicator
        android:id="@+id/ink_page_indicator"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="32dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```
Then in your `Activiy` or `Fragment` link the `ViewPager2` to the `InkPagerIndicator`.

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        val inkPageIndicator = findViewById<InkPageIndicator>(R.id.ink_page_indicator)

        inkPageIndicator.setViewPager(viewPager)
    }
}
``` 

## Customize
`InkPageIndicator` comes with a series of custom attributes that let you customize its appearance directly from the XML layout file.

```xml
<com.fjoglar.inkpageindicator.InkPageIndicator
        android:id="@+id/ink_page_indicator"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="32dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:animationDuration="300"
        app:dotDiameter="8dp"
        app:dotGap="8dp"
        app:currentPageIndicatorColor="@color/purple_500"
        app:pageIndicatorColor="@color/purple_200" />
```

The default values for these attributes are: 

```
animationDuration = 400 ms                <!-- Dot translation animation in milliseconds -->
dotDiameter = 8 dp                        <!-- Dot diameter in dp -->
dotGap = 12 dp                            <!-- Space between dots in dp -->
currentPageIndicatorColor = 100% white    <!-- Selected dot color -->
pageIndicatorColor = 50% white            <!-- Not selected dot color -->
```

## Preview
![](https://github.com/fjoglar/InkPageIndicator/blob/master/screenshots/plaid.gif)
![](https://github.com/fjoglar/InkPageIndicator/blob/master/screenshots/lyricly.gif)

## Contribute
Don't hesitate to open GitHub issues, even to ask questions or discuss a new feature. Pull-requests are welcome, but please open an issue first so that we can discuss the initial design or fix, which may avoid unnecessary work.

## License

```
Copyright 2020 Felipe Joglar
Copyright 2018 Google LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
