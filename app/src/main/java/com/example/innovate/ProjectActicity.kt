package com.example.innovate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.innovate.databinding.ActivityProjectActicityBinding
import com.example.innovate.userConstant.getUsers
import com.example.innovate.userConstant.tempUser
import com.example.innovate.userConstant.thisUser

class ProjectActicity : AppCompatActivity() {
    private var binding : ActivityProjectActicityBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectActicityBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        var mediaControls: MediaController? = null
        if (mediaControls == null) {
            mediaControls = MediaController(this)
            mediaControls.setAnchorView(binding?.videoplayer)
        }
        binding?.videoplayer?.setMediaController(mediaControls)
        binding?.videoplayer?.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.pexels))
        binding?.videoplayer?.requestFocus()
        binding?.videoplayer?.start()
        binding?.profileAnirudhParida?.setOnClickListener {
            tempUser= thisUser
            thisUser= getUsers()[2]
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }
    }
}