package com.myfirstapplication.tx2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), myInterface {
    override fun myFun(data: String) {
        (supportFragmentManager.findFragmentById(R.id.fTwo)as fragmentTwo).display(data)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragOne = fragmentOne()
        var myFrag = supportFragmentManager.beginTransaction()
        myFrag.replace(R.id.mainID, fragOne).commit()

    }
}
