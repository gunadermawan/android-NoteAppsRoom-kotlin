package com.gunder.mynoteappsroom.helper

import java.text.SimpleDateFormat
import java.util.*

object DateHelper {
    fun getCurrentDate(): String {
        val dateFomat = SimpleDateFormat("yyyy/MM//dd HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFomat.format(date)
    }
}