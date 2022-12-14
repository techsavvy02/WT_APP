package com.example.wtapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wtapp.R
import com.example.wtapp.SampleMessages
import com.example.wtapp.model.Message

class ListOfMessagesAdapter(val context:Context):RecyclerView.Adapter<ListOfMessagesAdapter.MsgViewHolder>() {
    private val sampleMessages = SampleMessages()
    private val listOfMessages : List<Message> =sampleMessages.LIST_OF_MESSAGES

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {
      val itemView: View= LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout,parent, false)
    return MsgViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
        holder.username.text= listOfMessages[position].username
        holder.message.text= listOfMessages[position].message

    }

    override fun getItemCount(): Int {
      return listOfMessages.size
    }

    class MsgViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val username: TextView = itemView.findViewById(R.id.userName)
        val message: TextView=itemView.findViewById(R.id.status)

    }
}