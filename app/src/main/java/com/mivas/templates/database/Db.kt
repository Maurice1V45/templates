package com.mivas.templates.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.mivas.templates.App
import com.mivas.templates.database.dao.PersonDao
import com.mivas.templates.database.model.DbPerson

@Database(entities = [DbPerson::class], version = 1)
abstract class Db : RoomDatabase() {

    abstract fun getPersonDao(): PersonDao

    companion object {
        val instance: Db = Room.databaseBuilder(App.instance.applicationContext, Db::class.java, "TEMPLATEDB")
                .allowMainThreadQueries()
                .build()
    }

}