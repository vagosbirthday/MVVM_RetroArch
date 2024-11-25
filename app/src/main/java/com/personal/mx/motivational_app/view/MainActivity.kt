package com.personal.mx.motivational_app.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.personal.mx.motivational_app.R
import com.personal.mx.motivational_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

    }
}