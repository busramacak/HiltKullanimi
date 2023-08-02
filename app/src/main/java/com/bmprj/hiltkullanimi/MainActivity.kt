package com.bmprj.hiltkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject //Field Injection
    lateinit var lars:Musician

    @Inject
    lateinit var myClass:Example

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val b = Band()
//        val i = Instrument()
//
//        val m = Musician(i,b)
//        m.sing()
//
        lars.sing()

        println(myClass.myFunction())
        println(myClass.secondFunction())
    }
}