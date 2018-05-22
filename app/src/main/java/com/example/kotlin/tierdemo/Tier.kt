package com.example.kotlin.tierdemo

import android.util.Log

open class Tier (alter: Int, speed: Int, name: String): AbstractTier(alter, speed, name) {
    override fun aelter(neuesAlter: Int) {
        alter = neuesAlter
        Log.i("Test", "Neues Alter: $alter")
    }

    override fun gibInfo(): String {
        val text = "Info: $name ist $alter Jahre alt und $speed schnell"
        Log.i("Text", text )
        return text
    }


}