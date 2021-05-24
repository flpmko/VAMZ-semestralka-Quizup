package sk.uniza.fri.simko.semestralka.model

/**
 * Question
 *
 * Predstavuje otazku.
 *
 * @property id
 * @property question
 * @property image
 * @property answer1
 * @property answer2
 * @property answer3
 * @property answer4
 * @property correctAnswer
 * @constructor Create empty Question
 */
data class question (
    val id: Int,
    val question: String,
    val image: Int,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val answer4: String,
    val correctAnswer: Int
)