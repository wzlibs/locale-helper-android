package com.zeugmasolutions.localeexample.util

import android.content.Context
import android.util.TypedValue

fun Context.dpToPx(value: Float) = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,
    value,
    resources.displayMetrics
)