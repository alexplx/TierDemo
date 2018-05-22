package com.example.kotlin.tierdemo

import android.util.Log

class TierCat (alter: Int, speed: Int, name3: String) : Tier(alter, speed, name3) {

    fun gibLaut(){
        Log.i("Text", "$name sagt Miau")
        aelter(alter + 2)
    }

}