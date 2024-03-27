package com.example.attend.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.attend.R

data class HomeServices(
    @StringRes val serviceName: Int,
    @DrawableRes val serviceIcon: Int

)

val homeServices = listOf(
    HomeServices( R.string.qrcode, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.nfc, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.reports, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.analytics, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.units, R.drawable.ic_launcher_foreground),
    HomeServices( R.string.input, R.drawable.ic_launcher_foreground),
)