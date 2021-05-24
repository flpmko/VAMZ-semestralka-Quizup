package sk.uniza.fri.simko.semestralka.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ScoreDatabaseDao {

    @Insert
    fun insert(score : Score)

    @Update
    fun update(score : Score)

    @Query("select * from score_table where scoreID = :key")
    fun get(key: Long): Score?

    @Query("DELETE FROM score_table")
    fun clear()

    @Query("select * from score_table order by scoreID desc limit 1")
    fun getLatest(): Score?

    @Query("select * from score_table order by score desc limit 1")
    fun getBest(): Score?

    @Query("select * from score_table order by scoreID desc")
    fun getAll(): List<Score> ?

    @Query("select * from score_table order by score desc")
    fun getAllOrderedByScore(): List<Score> ?

    @Query("select count(scoreID) from score_table")
    fun getSize(): Long
}