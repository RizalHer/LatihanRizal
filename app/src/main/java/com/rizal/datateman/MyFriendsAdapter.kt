package com.rizal.datateman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_item.*

class MyFriendsAdapter (private val context: Context, private val items: ArrayList<MyFriends>) :
    RecyclerView.Adapter<MyFriendsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItem(items.get(position))
    }
    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView), LayoutContainer{
                fun bindItem(item:MyFriends){
                    txtName.text=item.nama
                    txtEmail.text=item.email
                    txtTelp.text=item.telp
                }
            }
}