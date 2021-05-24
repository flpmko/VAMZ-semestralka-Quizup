package sk.uniza.fri.simko.semestralka.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Score
 *
 * Objekt predstavujuci zaznam v databaze.
 *
 * @property scoreID
 * @property score
 * @property category
 * @constructor Create empty Score
 */
@Entity(tableName = "score_table")
data class Score (

    @PrimaryKey(autoGenerate = true)
    val scoreID : Long = 0L,
    @ColumnInfo
    var score : Int = 0,
    @ColumnInfo
    var category : String = ""

)