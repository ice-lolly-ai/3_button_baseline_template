package com.example.videoplayerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videoplayerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Set click listeners for the buttons
//        // to navigate to the different Views/Pages
//        binding.btnMain.setOnClickListener {
//            val intent = Intent(this, com.example.videoplayerapp.MainActivity::class.java)
//            startActivity(intent)
//        }

        binding.btnVideo1.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video1Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo2.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video2Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo3.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video3Activity::class.java)
            startActivity(intent)
            }
        }
    }


