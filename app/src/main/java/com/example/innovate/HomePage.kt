package com.example.innovate

import android.content.Intent
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

        binding?.userName?.text=currentUser?.shortName
        currentUser?.userImage?.let { binding?.userImageId?.setImageResource(it) }
        binding?.navigationBarButton?.setOnClickListener {
            //val intent = Intent(this, NavigationDrawer::class.java)
            //startActivity(intent)
        }
        binding?.userImageId?.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }
    }
}