package com.example.innovate

data class project(
    val projectName : String,
    val projectImage : Int,
    val benefitsImage : Int,
    val noLikes : Int,
    val noViews : Int,
    val noComments : Int,
    val problem : String,
    val moreDetails : String,
    val aboutProject : String,
    val projectVideo : Int,
    val creators : ArrayList<userProfile>
)