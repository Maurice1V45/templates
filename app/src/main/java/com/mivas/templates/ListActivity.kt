package com.mivas.templates

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.mivas.templates.adapter.PersonListAdapter
import com.mivas.templates.model.Person
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity: AppCompatActivity() {

    val persons = listOf(Person("Marius", "Ivas", 28),
            Person("Nicu", "Ivas", 56),
            Person("Nina", "Ivas", 51))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initViews()
    }

    fun initViews() {
        personList.layoutManager = LinearLayoutManager(this)
        // personList.layoutManager = GridLayoutManager(this, 2) // for grid
        personList.adapter = PersonListAdapter(this, persons)
    }

    fun initListeners() {

    }

}