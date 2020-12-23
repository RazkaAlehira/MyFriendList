package com.example.myfriendlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfriendlist.FriendDetail
import com.example.myfriendlist.R
import kotlinx.android.synthetic.main.my_friends_layout.view.*

class FriendsAdapter(private val friends: List<FriendDetail>, private val friendClicked: () -> Unit) : RecyclerView.Adapter<FriendsAdapter.ViewHolder>() {


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.my_friends_layout, parent, false)
        return ViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friends[position]
        holder.view.txt_title.text = "${friend.firstName} ${friend.lastName}"
        holder.view.img_friend.setImageDrawable(holder.view.context.getDrawable(friend.photo))
        holder.view.setOnClickListener {
            friendClicked.invoke()
        }
    }

    override fun getItemCount() = friends.size
}