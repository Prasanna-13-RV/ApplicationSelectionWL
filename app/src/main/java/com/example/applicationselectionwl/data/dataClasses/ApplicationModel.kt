package com.example.applicationselectionwl.data.dataClasses

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ApplicationModel(val aid: Int, val applicationName: String, val image: Int) : Parcelable