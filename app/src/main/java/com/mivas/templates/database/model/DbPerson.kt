package com.mivas.templates.database.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "persons")
data class DbPerson(@PrimaryKey(autoGenerate = true) var id: Long?,
                    @ColumnInfo(name = "first_name") var firstName: String,
                    @ColumnInfo(name = "last_name") var lastName: String,
                    @ColumnInfo(name = "age") var age: Int) {
    constructor() : this(null, "", "", 0)
    constructor(firstName: String, lastName: String, age: Int) : this(null, firstName, lastName, age)
}
