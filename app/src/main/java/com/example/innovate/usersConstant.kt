package com.example.innovate

object userConstant{
    var thisUser : userProfile? = null

    fun getUsers() : ArrayList<userProfile>{
        val usersArray : ArrayList<userProfile> = ArrayList<userProfile>()

        val user1 = userProfile(
            "Swoyam Siddharth Nayak",
            R.drawable.userswoyam,
            18,
            46,
            574,
            2,
            ArrayList<project>(),
            "swoyam2609",
            "Somu@123"
        )
        usersArray.add(user1)

        val user2 = userProfile(
            "Prince Pious Omm Prakash",
            R.drawable.userswoyam,
            18,
            46,
            574,
            2,
            ArrayList<project>(),
            "princeX04",
            "Somu@123"
        )
        usersArray.add(user2)

        return usersArray
    }
}