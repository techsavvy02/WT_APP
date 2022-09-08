package com.example.wtapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wtapp.adapter.ListOfFriendsAdapter

class NewGroupActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)



        recyclerView=findViewById(R.id.listOfFriends)
        recyclerView.adapter= ListOfFriendsAdapter(this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        //adding lines after each user


        val decor=DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerView.addItemDecoration(decor)

    }
}