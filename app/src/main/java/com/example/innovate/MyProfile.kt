package com.example.innovate

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
        binding?.userName?.text=currentUser?.shortName
        currentUser?.userImage?.let { binding?.userImageId?.setImageResource(it) }
        binding?.noAwards?.text= currentUser?.noAwards.toString()
        binding?.noFollowers?.text=currentUser?.noFollowers.toString()
        binding?.noIdeas?.text=currentUser?.noIdeas.toString()
        binding?.noProjects?.text=currentUser?.noProjects.toString()




    }
}