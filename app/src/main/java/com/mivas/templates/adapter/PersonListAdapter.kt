package com.mivas.templates.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mivas.templates.R
import com.mivas.templates.model.Person
import kotlinx.android.synthetic.main.list_item_person.view.*

class PersonListAdapter(private val context: Context, private val persons: List<Person>) : RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_person, parent, false))
    override fun getItemCount() = persons.size
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val person = persons[position]
        with(viewHolder) {
            personImage.setImageResource(R.drawable.ic_launcher_foreground)
            personText.text = person.getDisplayName()
            parent.setOnClickListener { Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show() }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val personImage = view.personImage!!
        val personText = view.personText!!
        val parent = view
    }

}