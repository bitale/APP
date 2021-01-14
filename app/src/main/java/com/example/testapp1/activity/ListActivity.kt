package com.example.testapp1.activity

import android.app.Activity
import android.os.Bundle
import com.example.testapp1.Contacts
import com.example.testapp1.R
import com.example.testapp1.ContactsListAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : Activity() {

    private val contactList : List<Contacts> = listOf(
        Contacts("홍길동", "010-1234-1234"),
        Contacts("임꺽정", "010-4093-3948"),
        Contacts("장길산", "010-0481-4948"),
        Contacts("김철수", "010-9485-4938"),
        Contacts("한유리", "010-1431-6654"),
        Contacts("강힘찬", "010-1224-4314")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = ContactsListAdapter(contactList)
        mRecyclerView.adapter = adapter
    }
}