package com.mivas.templates

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mivas.templates.database.Db
import com.mivas.templates.database.model.DbPerson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.instance.applicationContext.packageName
        Db.instance.getPersonDao().insert(DbPerson("Marius", "Ivas", 28))
        Log.w("asd", Db.instance.getPersonDao().getAll().toString())


    }

}
