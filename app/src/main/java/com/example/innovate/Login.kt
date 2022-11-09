package com.example.innovate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.innovate.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private var binding : ActivityLoginBinding ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var userFound = false
        var passCorrect = false
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        userConstant.thisUser = null

        binding?.backButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding?.btnLogin?.setOnClickListener {
            if (binding?.etUserName?.text?.isEmpty() == true){
                Toast.makeText(this, "Enter your User Name", Toast.LENGTH_LONG).show()
            }
            else {
                val users : ArrayList<userProfile> = userConstant.getUsers()
                for(i in users){
                    if(binding?.etUserName?.text?.toString()==i.userName) {
                        userFound=true
                        userConstant.thisUser =i
                        passCorrect = binding?.etPassword?.text?.toString()==i.userPassword
                    }
                }
                val intent = Intent(this, HomePage::class.java)
                if(userFound && passCorrect){
                    startActivity(intent)
                    finish()
                }
                else if(userFound && !passCorrect){
                    binding?.passwordDialog?.text="Incorrect Password"
                }
                else{
                    binding?.passwordDialog?.text="Invalid User"
                }

            }
        }
    }
}