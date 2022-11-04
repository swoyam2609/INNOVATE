package com.example.innovate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.innovate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnLogin?.setOnClickListener {
            if (binding?.etUserName?.text?.isEmpty() == true){
                Toast.makeText(this, "Enter your User Name", Toast.LENGTH_LONG).show()
            }
            else {
                val intent = Intent(this,ExcerciseAcitivity::class.java)
                startActivity(intent)
            }
        }

    }
}