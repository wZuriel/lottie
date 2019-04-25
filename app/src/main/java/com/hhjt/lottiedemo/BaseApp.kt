package com.hhjt.lottiedemo

import android.app.Application
import com.facebook.fresco.helper.Phoenix

/**
 * Created by Zuriel Cotter on 2019/4/2.
 */
class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
//        Fresco.initialize(this)
        Phoenix.init(this)
    }
}