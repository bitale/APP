package com.example.testapp1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contacts.view.*

class ContactsViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var view : View = v;

    fun bind(item: Contacts, onClickListener: View.OnClickListener) {
        view.mName.text = item.name
        view.mTel.text = item.tel
    }
}