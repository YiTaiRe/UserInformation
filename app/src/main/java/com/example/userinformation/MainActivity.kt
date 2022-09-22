package com.example.userinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //获取手机密度
        val dm = resources.displayMetrics
        val a = dm.density
        Log.d("---------","密度为$a")
    }
}