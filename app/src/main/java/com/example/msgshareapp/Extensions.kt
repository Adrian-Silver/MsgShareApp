package com.example.msgshareapp

import android.app.Activity
import android.content.Context
import android.widget.Toast
import java.time.Duration


//      Having duration set enables use of default parameters.

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}


//  fun Context.showToast(message: String){
//      Toast.makeText(this, message,Toast.LENGTH_SHORT).show()
//  }