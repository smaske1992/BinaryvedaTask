package com.binaryveda.biju.testveda

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

/**
 * Created by sachin.maske on 10-08-2017.
 */

class FontTextView : TextView {

    constructor(context: Context) : super(context) {}
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setCustomFont(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setCustomFont(context, attrs)
    }

    private fun setCustomFont(ctx: Context, attrs: AttributeSet?) {
        val a = ctx.obtainStyledAttributes(attrs, R.styleable.FontTextView)
        val customFont = a.getString(R.styleable.FontTextView_fontName)
        setCustomFont(ctx, customFont)
        a.recycle()
    }

    fun setCustomFont(ctx: Context, asset: String?): Boolean {
        var tf: Typeface? = null
        try {
            tf = Typeface.createFromAsset(ctx.assets, asset)
        } catch (e: Exception) {
            Log.e("FontView", "Could not get typeface: " + e.message)
            return false
        }

        typeface = tf
        return true
    }
}