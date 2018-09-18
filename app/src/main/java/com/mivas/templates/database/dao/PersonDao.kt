package com.mivas.templates.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.mivas.templates.database.model.DbPerson

@Dao
interface PersonDao {

    @Insert(onConflict = REPLACE)
    fun insert(dbPerson: DbPerson)

    @Query("SELECT * FROM persons where id = :id")
    fun getById(id: Long): DbPerson

    @Query("SELECT * FROM persons")
    fun getAll(): List<DbPerson>

    @Delete
    fun delete(dbPerson: DbPerson)

    @Delete
    fun deleteAll(dbPersons: List<DbPerson>)

    @Query("DELETE FROM persons where id = :id")
    fun deleteById(id: Long)

    @Query("DELETE FROM persons")
    fun clear()
}