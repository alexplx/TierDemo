package com.example.kotlin.tierdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val waldi = TierHund(5,25,"Waldi")
        waldi.gibLaut()
        waldi.gibLaut()
        val mimi = TierCat(5, 20, "Mimi")
        mimi.gibLaut()
        mimi.gibLaut()
    }
}
