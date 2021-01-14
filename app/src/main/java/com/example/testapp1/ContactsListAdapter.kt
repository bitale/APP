package com.example.testapp1


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ContactsListAdapter(private val itemList : List<Contacts>) : RecyclerView.Adapter<ContactsViewHolder>()  {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_contacts, parent, false)
        return ContactsViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val item = itemList[position]
        val adapter = this

        holder.apply {
            bind(item, View.OnClickListener{
                Toast.makeText(view.context, "Adapter\n${item.name}\n${item.tel}", Toast.LENGTH_SHORT).show()
//                item.name = item.name + "1"
                adapter.notifyDataSetChanged()
            })
        }
    }

}