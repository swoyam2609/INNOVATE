package com.example.innovate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.innovate.databinding.ActivityHomePageBinding
import com.example.innovate.databinding.ActivityMyProfileBinding

class MyProfile : AppCompatActivity() {

    private var binding : ActivityMyProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyProfileBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val currentUser : userProfile? = userConstant.thisUser
        binding?.userName?.text=currentUser?.name
        currentUser?.userImage?.let { binding?.userImageId?.setImageResource(it) }
        binding?.noAwards?.text= currentUser?.noAwards.toString()
        binding?.noFollowers?.text=currentUser?.noFollowers.toString()
        binding?.noIdeas?.text=currentUser?.noIdeas.toString()
        binding?.noProjects?.text=currentUser?.noProjects.toString()

        binding?.tvReadMore6?.setOnClickListener {
            val intent = Intent(this, ProjectActicity::class.java)
            startActivity(intent)
        }

        binding?.tvReadMore2?.setOnClickListener {
            val intent = Intent(this, ProjectActicity::class.java)
            startActivity(intent)
        }

        binding?.tvReadMore3?.setOnClickListener {
            val intent = Intent(this, ProjectActicity::class.java)
            startActivity(intent)
        }

        binding?.tvReadMore4?.setOnClickListener {
            val intent = Intent(this, ProjectActicity::class.java)
            startActivity(intent)
        }

        binding?.tvReadMore5?.setOnClickListener {
            val intent = Intent(this, ProjectActicity::class.java)
            startActivity(intent)
        }




    }
}