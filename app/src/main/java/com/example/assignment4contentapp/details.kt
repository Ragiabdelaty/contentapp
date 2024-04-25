package com.example.assignment4contentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.IntentCompat
import com.example.assignment4contentapp.databinding.ActivityDetailsBinding

class details : AppCompatActivity() {


    lateinit var binding2: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding2.root)


        var element=IntentCompat.getParcelableExtra(intent,"keyelement",contact::class.java)

        element?.let {
            binding2.Nameofcaller2.text=it.name

            binding2.Numberofcaller2.text=it.phone

            binding2.Description2.text=it.description
        }

    }
}