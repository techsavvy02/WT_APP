package com.example.wtapp

import com.example.wtapp.model.Message
import com.example.wtapp.model.User

class SampleData {
    val LIST_OF_FRIENDS: List <User> = listOf(
        User("james paul", "Calls ony"),        User("Firdaus","Hey! I'm alive"),
        User("Hamad","busy"),
        User("Fareedah","Hey! I'm using Whatsapp"),
        User("Jasmine","Emargency calls only"),
        User("Nasirah","Sab'r"),
        User("Abdul","Hey! I'm using Whatsapp"),
        User("Maryam","Food is life"),
        User("Ibrahim","Manchester United"),
        User("Muhammed","Alhamdulilahi"),
        User("Abdul","Hey! I'm using Whatsapp"),


    )
}
class SampleMessages{
    val LIST_OF_MESSAGES: List <Message> = listOf(
        Message ("Firdaus", "19:00","I need to finish this course"),
        Message ("Hamad", "18:00","Yooo"),
        Message ("Fareedah", "19:50","Food is ready"),
        Message ("Jasmine", "14:30","Hiiii"),
        Message ("Nasirah", "18:00","K bro"),
        Message ("Abdul", "2045","Suffecient for me is Allah"),



        )
}