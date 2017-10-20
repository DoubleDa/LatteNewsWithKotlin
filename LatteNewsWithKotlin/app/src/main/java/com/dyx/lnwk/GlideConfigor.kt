package com.dyx.lnwk

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.module.GlideModule

/**
 *
 * Author：dayongxin
 * Function：
 *
 */
class GlideConfigor : GlideModule {
    override fun applyOptions(context: Context?, builder: GlideBuilder?) {
        builder?.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888)
    }

    override fun registerComponents(context: Context?, glide: Glide?) {
    }
}