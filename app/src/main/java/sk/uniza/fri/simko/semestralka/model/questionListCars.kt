package sk.uniza.fri.simko.semestralka.model

import sk.uniza.fri.simko.semestralka.R

/**
 * Question list cars
 *
 * List otazok pre auta.
 *
 * @constructor Create empty Question list cars
 */
object questionListCars: questionList(){

    override var map: HashMap<String, Int>? =  hashMapOf(
        "Abarth" to R.drawable.car_abarth,
        "Accura" to R.drawable.car_accura,
        "Alfa Romeo" to R.drawable.car_alfa_romeo,
        "Alpina" to R.drawable.car_alpina,
        "Aston Martin" to R.drawable.car_aston_martin,
        "Audi" to R.drawable.car_audi,
        "Bentley" to R.drawable.car_bentley,
        "Bertone" to R.drawable.car_bertone,
        "BMW" to R.drawable.car_bmw,
        "Buick" to R.drawable.car_buick,
        "Bugatti" to R.drawable.car_bugatti,
        "BYD" to R.drawable.car_byd,
        "Borgward" to R.drawable.car_borgward,
        "Cadillac" to R.drawable.car_cadillac,
        "Changan" to R.drawable.car_changan,
        "Chevrolet" to R.drawable.car_chevrolet,
        "Chrysler" to R.drawable.car_chrysler,
        "Daewo" to R.drawable.car_daewo,
        "Dodge" to R.drawable.car_dodge,
        "Faw" to R.drawable.car_faw,
        "Ferrari" to R.drawable.car_ferrari,
        "Fiat" to R.drawable.car_fiat,
        "Ford" to R.drawable.car_ford,
        "GMC" to R.drawable.car_gmc,
        "Honda" to R.drawable.car_honda,
        "Hyundai" to R.drawable.car_hyundai,
        "Infinity" to R.drawable.car_infinity,
        "Jaguar" to R.drawable.car_jaguar,
        "Jeep" to R.drawable.car_jeep,
        "KIA" to R.drawable.car_kia,
        "Koenigsegg" to R.drawable.car_koenigsegg,
        "Lamborghini" to R.drawable.car_lamborghini,
        "Lancia" to R.drawable.car_lancia,
        "Land Rover" to R.drawable.car_land_rover,
        "Lexus" to R.drawable.car_lexus,
        "Lincoln" to R.drawable.car_lincoln,
        "Lotus" to R.drawable.car_lotus,
        "Luxgen" to R.drawable.car_luxgen,
        "Mazda" to R.drawable.car_mazda,
        "Mercedes" to R.drawable.car_mercedes,
        "MG" to R.drawable.car_mg,
        "Mini Cooper" to R.drawable.car_mini,
        "Mitsubishi" to R.drawable.car_mitsubishi,
        "Nissan" to R.drawable.car_nissan,
        "Opel" to R.drawable.car_opel,
        "Porshe" to R.drawable.car_porshe
    )

    /**
     * Get car questions
     *
     * Vrati list otazok aut.
     *
     * @return
     */
    fun getCarQuestions(): ArrayList<question>{
        return super.getQuestionList("Značka ktorého auta je na obrázku?")
    }

    /**
     * Get random car question
     *
     * Vrati nahodnu otazku z listu aut.
     *
     * @return
     */
    fun getRandomCarQuestion(): question {
        return super.randomQuestion("Značka ktorého auta je na obrázku?")
    }
}