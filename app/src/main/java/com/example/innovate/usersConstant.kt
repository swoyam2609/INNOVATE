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
            "prince##2003"
        )
        usersArray.add(user2)

        val user3 = userProfile(
            "Anirudh Parida",
            R.drawable.userswoyam,
            18,
            46,
            574,
            2,
            ArrayList<project>(),
            "anirudh0812",
            "anirudh08"
        )
        usersArray.add(user3)

        return usersArray
    }


}