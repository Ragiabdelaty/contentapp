package com.example.assignment4contentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class contact(val name:String,val phone:String,val description:String):Parcelable