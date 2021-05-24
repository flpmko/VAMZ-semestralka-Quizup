package sk.uniza.fri.simko.semestralka.model

import sk.uniza.fri.simko.semestralka.R

object questionListBrands: questionList(){

    override var map: HashMap<String, Int>? =  hashMapOf(
        "Accor" to R.drawable.brand_accor,
        "Adidas" to R.drawable.brand_adidas,
        "Air China" to R.drawable.brand_air_china,
        "Air India" to R.drawable.brand_air_india,
        "Airforce" to R.drawable.brand_airforce,
        "Alianz" to R.drawable.brand_alianz,
        "Anonymus" to R.drawable.brand_anonymus,
        "Applebee's" to R.drawable.brand_applebees,
        "USA army" to R.drawable.brand_army,
        "Astra Zeneca" to R.drawable.brand_astra_zeneca,
        "Baskin Robins" to R.drawable.brand_baskin_robins,
        "Behringer" to R.drawable.brand_behringer,
        "BIC" to R.drawable.brand_bic,
        "Billabong" to R.drawable.brand_billabong,
        "Burger King" to R.drawable.brand_burger_king,
        "Burton" to R.drawable.brand_burton,
        "Carrefour" to R.drawable.brand_carrefour,
        "Cartoon Network" to R.drawable.brand_cartoon_network,
        "CBNC" to R.drawable.brand_cbnc,
        "Chanel" to R.drawable.brand_chanel,
        "Chevron" to R.drawable.brand_chevron,
        "Central Inteligence Agency" to R.drawable.brand_cia,
        "Converse" to R.drawable.brand_coverse,
        "Diary Queen" to R.drawable.brand_dairy_queen,
        "DC shoes" to R.drawable.brand_dc,
        "DigiCo" to R.drawable.brand_digico,
        "Dove" to R.drawable.brand_dove,
        "Dreamworks Studios" to R.drawable.brand_dreamworks,
        "Emporio Armani" to R.drawable.brand_emporio,
        "Formula 1" to R.drawable.brand_formula,
        "Fox" to R.drawable.brand_fox,
        "General Electric" to R.drawable.brand_general_electric,
        "Glaxo Smith Kline" to R.drawable.brand_glaxo_smith_kline,
        "Hallmark" to R.drawable.brand_hallmark,
        "Heineken" to R.drawable.brand_heineken,
        "Hermes" to R.drawable.brand_hermes,
        "Michelin" to R.drawable.brand_michelin,
        "Panda Express" to R.drawable.brand_panda_express,
        "Puma" to R.drawable.brand_puma,
        "Reebok" to R.drawable.brand_reebok,
        "Roland" to R.drawable.brand_roland,
        "Sabian" to R.drawable.brand_sabian,
        "Singapore airlines" to R.drawable.brand_singapore_airlines,
        "Watsons" to R.drawable.brand_watsons,
        "Wutang" to R.drawable.brand_wutang,
    )

    fun getBrandQuestions(): ArrayList<question>{
        return super.getQuestionList("Ktorej spoločnosti patrí toto logo?")
    }

    fun getRandomBrandQuestion(): question {
        return super.randomQuestion("Ktorej spoločnosti patrí toto logo?")
    }
}