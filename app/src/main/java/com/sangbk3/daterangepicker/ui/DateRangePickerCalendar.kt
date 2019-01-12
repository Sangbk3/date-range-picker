package com.sangbk3.daterangepicker.ui

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.sangbk3.daterangepicker.R
import kotlin.jvm.JvmOverloads

class DateRangePickerCalendar @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.calendar_range_picker, this, true)
    }
}