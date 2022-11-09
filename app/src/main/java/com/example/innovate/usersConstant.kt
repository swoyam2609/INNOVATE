package com.example.innovate

object userConstant{
    var thisUser : userProfile? = null

    fun getUsers() : ArrayList<userProfile>{
        val usersArray : ArrayList<userProfile> = ArrayList<userProfile>()

        val user1 = userProfile(
            "Swoyam",
            "Swoyam Siddharth",
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
            "Prince",
            "Prince Pious",
            R.drawable.prince,
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
            "Anirudh",
            "Anirudh Parida",
            R.drawable.anirudh1,
            18,
            46,
            574,
            2,
            ArrayList<project>(),
            "anirudh0812",
            "anirudh08"
        )
        usersArray.add(user3)

        val user4 = userProfile(
            "Abhipsha",
            "Abhipsha Dash",
            R.drawable.maida,
            18,
            46,
            574,
            2,
            ArrayList<project>(),
            "Abhipsha04",
            "Abhipsha#04"
        )
        usersArray.add(user4)

        return usersArray
    }


    fun getProjects():ArrayList<project>{
        val userProject : ArrayList<project> = ArrayList<project>()

        val project1 = project(
            "Swasner",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project1)

        val project6 = project(
            "Payroll Management",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project6)

        val project2 = project(
            "Trahi",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project2)

        val project3 = project(
            "PAPR",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project3)

        val project4 = project(
            "Sync Up",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project4)

        val project5 = project(
            "Bookers",
            R.drawable.projectpic,
            R.drawable.benfits,
            1200,
            2300,
            450,
            "Inadequate PPEs and masks, coupled with lack of\n" +
                    "affordable critical care equipments, amplified this\n" +
                    "outbreak into a major pandemic. Over 20 Lakh\n" +
                    "People have died due to this, and we are still\n" +
                    "years from complete eradication.\n",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            "Swasner which is a hyperbaric chamber which is designed to treat ARDS patients, a primary disease caused by Coronavirus. On metric it reduces dependency on ventilator and also requires the patient to spend less time with the ventilator. It is is a modified chamber-like device which can help a patient breathe better, and can be used without a ventilator using oxygen wall mounts. The helmet uses Nasal intermittent positive pressure ventilation (NIPPV) to provide oxygen surplus air to the patient. Swasner consists of three major components, the bubble (or visor), the plastic rings, and the neck seal. The plastic bubble is transparent, flexible, and encloses the head of the patient entirely, thus making it more comfortable for the patient.",
            R.raw.pexels,
            ArrayList<userProfile>(getUsers())
        )
        userProject.add(project5)

        return userProject
    }

}