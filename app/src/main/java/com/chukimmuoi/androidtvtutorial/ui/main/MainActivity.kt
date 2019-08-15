package com.chukimmuoi.androidtvtutorial.ui.main

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.chukimmuoi.androidtvtutorial.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
