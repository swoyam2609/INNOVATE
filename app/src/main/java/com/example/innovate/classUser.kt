package com.example.innovate

data class userImage(
    val userInmage : Int,
    val noProjects : Int,
    val noIdeas : Int,
    val noFollowers : Int,
    val noAwards : Int,
    val projects : ArrayList<project>,
    val userName : String,
    val userPassword : String
)