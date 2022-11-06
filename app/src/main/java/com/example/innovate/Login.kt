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

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        userConstant.thisUser = null

        binding?.btnLogin?.setOnClickListener {
            if (binding?.etUserName?.text?.isEmpty() == true){
                Toast.makeText(this, "Enter your User Name", Toast.LENGTH_LONG).show()
            }
            else {
                val users : ArrayList<userProfile> = userConstant.getUsers()
                for(i in users){
                    if(binding?.etUserName?.text?.toString()==i.userName) {
                        if(binding?.etPassword?.text?.toString()==i.userPassword){
                            val intent = Intent(this, HomePage::class.java)
                            userConstant.thisUser =i
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