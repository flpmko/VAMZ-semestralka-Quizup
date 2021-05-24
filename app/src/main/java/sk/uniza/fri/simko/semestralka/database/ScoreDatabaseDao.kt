package sk.uniza.fri.simko.semestralka.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ScoreDatabaseDao {

    /**
     * Insert
     *
     * Metoda insert, insertuje udaje do databazy.
     *
     * @param score
     */
    @Insert
    fun insert(score : Score)

    /**
     * Update
     *
     * Metoda update, updatuje existujuci zaznam v databaze.
     *
     * @param score
     */
    @Update
    fun update(score : Score)

    /**
     * Get
     *
     * Vyberie z databazy konkretny zaznam, ktory ma dany kluc.
     *
     * @param key
     * @return
     */
    @Query("select * from score_table where scoreID = :key")
    fun get(key: Long): Score?

    /**
     * Clear
     *
     * Vymaze vsetky udaje z databazy.
     */
    @Query("DELETE FROM score_table")
    fun clear()

    /**
     * Get latest
     *
     * Vrati naposledy zadany zaznam do databazy.
     *
     * @return
     */
    @Query("select * from score_table order by scoreID desc limit 1")
    fun getLatest(): Score?

    /**
     * Get best
     *
     * Vrati zaznam z databazy, kde hrac dosiahol najvyssie skore.
     *
     * @return
     */
    @Query("select * from score_table order by score desc limit 1")
    fun getBest(): Score?

    /**
     * Get all
     *
     * Vrati vsetky zaznamy z databazy ako list.
     *
     * @return
     */
    @Query("select * from score_table order by scoreID desc")
    fun getAll(): List<Score> ?

    /**
     * Get all ordered by score
     *
     * Vrati vsetky zaznamy z databazy ako list, zoradene podla skore.
     *
     * @return
     */
    @Query("select * from score_table order by score desc")
    fun getAllOrderedByScore(): List<Score> ?

    /**
     * Get size
     *
     * Vrati velkost databazy.
     *
     * @return
     */
    @Query("select count(scoreID) from score_table")
    fun getSize(): Long
}