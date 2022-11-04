package com.example.innovate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.innovate.databinding.ActivityMainBinding
import com.example.innovate.userConstant.getUsers
import com.example.innovate.userConstant.thisUser

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        thisUser = null

        binding?.btnLogin?.setOnClickListener {
            if (binding?.etUserName?.text?.isEmpty() == true){
                Toast.makeText(this, "Enter your User Name", Toast.LENGTH_LONG).show()
            }
            else {
                val users : ArrayList<userProfile> = getUsers()
                for(i in users){
                    if(binding?.etUserName?.text?.toString()==i.userName) {
                        if(binding?.etPassword?.text?.toString()==i.userPassword){
                            val intent = Intent(this, HomePage::class.java)
                            thisUser=i
                            startActivity(intent)
                            finish()
                        }
                        else{
                            Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show()
                        }
                    }
                    else{
                        Toast.makeText(this, "Incorrect UserName", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    }
}