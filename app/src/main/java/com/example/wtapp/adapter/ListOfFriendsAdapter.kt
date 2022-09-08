package com.example.wtapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wtapp.R
import com.example.wtapp.SampleData

class ListOfFriendsAdapter(val context:Context): RecyclerView.Adapter<ListOfFriendsAdapter.LFViewHolder> () {

     private val sampleData= SampleData()
    private val ListOfFriends=sampleData.LIST_OF_FRIENDS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LFViewHolder {
        val itemView= LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent,false)

        return LFViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: LFViewHolder, position: Int) {
        holder.userName.text= ListOfFriends[position].userName
        holder.status.text= ListOfFriends[position].status

    }

    override fun getItemCount(): Int {
        return ListOfFriends.size

    }
    class LFViewHolder(itemview:View): RecyclerView.ViewHolder(itemview){
        val userName: TextView= itemView.findViewById(R.id.userName)
        val status: TextView= itemView.findViewById(R.id.status)

    }
}