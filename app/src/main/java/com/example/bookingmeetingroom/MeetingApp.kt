package com.example.bookingmeetingroom

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MeetingApp : Application()
{
    override fun onCreate() {
        super.onCreate()
        // Initialize Sync; the system responsible for keeping data in the app up to date.
//        Sync.initialize(context = this)
    }

//    override fun newImageLoader(): ImageLoader {
//        return ImageLoader.Builder(this)
//            .components {
//                add(SvgDecoder.Factory())
//            }
//            .build()
//    }
}