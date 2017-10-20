package com.dyx.lnwk

import android.app.Application

/**
 *
 * Author：dayongxin
 * Function：
 *
 */
class XApplication : Application() {
    /**
     * 用Kotlin实现单例Application
     */
    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}