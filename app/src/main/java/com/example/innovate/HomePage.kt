package com.example.innovate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.innovate.databinding.ActivityHomePageBinding
import com.example.innovate.userConstant.thisUser

class HomePage : AppCompatActivity() {

    private var binding : ActivityHomePageBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomePageBinding.inflate(layoutInflater)

        setContentView(binding?.root)

        val currentUser : userProfile? = thisUser

        binding?.textView?.text=currentUser?.name




    }
}