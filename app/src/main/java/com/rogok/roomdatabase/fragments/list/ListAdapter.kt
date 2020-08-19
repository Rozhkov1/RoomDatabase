package com.rogok.roomdatabase.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rogok.roomdatabase.R
import com.rogok.roomdatabase.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.tv_id.text = currentItem.id.toString()
        holder.itemView.tv_first_name.text = currentItem.firstName.toString()
        holder.itemView.tv_last_name.text = currentItem.lastName.toString()
        holder.itemView.tv_age.text = currentItem.age.toString()
    }

    override fun getItemCount() = userList.size

    fun setData (user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}