package com.example.ejemplo_viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.ejemplo_viewbinding.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            Toast.makeText(this, "MÉTODO VIEW BINDING", Toast.LENGTH_SHORT).show()
        }
    }
}



