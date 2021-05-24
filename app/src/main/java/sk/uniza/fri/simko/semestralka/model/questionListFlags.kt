package sk.uniza.fri.simko.semestralka.model

import sk.uniza.fri.simko.semestralka.R

/**
 * Question list flags
 *
 * List otazok pre vlajky.
 *
 * @constructor Create empty Question list flags
 */
object questionListFlags: questionList(){

    override var map: HashMap<String, Int>? =  hashMapOf(
        "Afganistan" to R.drawable.flag_afganistan,
        "Alandy" to R.drawable.flag_alandy,
        "Albánsko" to R.drawable.flag_albansko,
        "Alžírsko" to R.drawable.flag_alzirsko,
        "Andorra" to R.drawable.flag_andora,
        "Angola" to R.drawable.flag_angola,
        "Antarktída" to R.drawable.flag_antarktida,
        "Antigua a Barbuda" to R.drawable.flag_antigua,
        "Argentína" to R.drawable.flag_argentina,
        "Arménsko" to R.drawable.flag_armensko,
        "Aruba" to R.drawable.flag_aruba,
        "Austrália" to R.drawable.flag_australia,
        "Azerbajdžan" to R.drawable.flag_azerbajdzan,
        "Bahamy" to R.drawable.flag_bahamy,
        "Bahrajn" to R.drawable.flag_bahrajn,
        "Bangladéš" to R.drawable.flag_banglades,
        "Barbados" to R.drawable.flag_barbados,
        "Belgicko" to R.drawable.flag_belgicko,
        "Belize" to R.drawable.flag_belize,
        "Benin" to R.drawable.flag_benin,
        "Bermudy" to R.drawable.flag_bermudy,
        "Bhután" to R.drawable.flag_bhutan,
        "Bielorusko" to R.drawable.flag_bielorusko,
        "Bolívia" to R.drawable.flag_bolivia,
        "Bosna a Hercegovina" to R.drawable.flag_bosna,
        "Botswana" to R.drawable.flag_botswana,
        "Brazília" to R.drawable.flag_brazilia,
        "Brunej" to R.drawable.flag_brunej,
        "Bulharsko" to R.drawable.flag_bulharsko,
        "Burkina Faso" to R.drawable.flag_burkina,
        "Burundi" to R.drawable.flag_burundi,
        "Čad" to R.drawable.flag_cad,
        "Česká republika" to R.drawable.flag_cesko,
        "Čile" to R.drawable.flag_cile,
        "Chorvátsko" to R.drawable.flag_chorvatsko,
        "Čierna hora" to R.drawable.flag_cierna_hora,
        "Čína" to R.drawable.flag_cina,
        "Cyprus" to R.drawable.flag_cyprus,
        "Dánsko" to R.drawable.flag_dansko,
        "Dominika" to R.drawable.flag_dominika,
        "Dominikánska republika" to R.drawable.flag_dominikanska_rep,
        "Džibutsko" to R.drawable.flag_dzibut,
        "Egypt" to R.drawable.flag_egypt,
        "Ekvádor" to R.drawable.flag_ekvador,
        "Eritrea" to R.drawable.flag_eritrea,
        "Estónsko" to R.drawable.flag_estonsko,
        "Etiópia" to R.drawable.flag_etiopia,
        "Faorské ostrovy" to R.drawable.flag_faorske,
        "Fidži" to R.drawable.flag_fidzi,
        "Filipíny" to R.drawable.flag_filipiny,
        "Fínsko" to R.drawable.flag_finsko,
        "Francúzska Guiana" to R.drawable.flag_farcuzska_guiana,
        "Francúzsko" to R.drawable.flag_francuzsko,
        "Francúzska Polynézia" to R.drawable.flag_francuzska_polynezia,
        "Francúzske južné a antarktické ostrovy" to R.drawable.flag_francuzske_juzne,
        "Gabon" to R.drawable.flag_gabon,
        "Gambia" to R.drawable.flag_gambia,
        "Gaza" to R.drawable.flag_gaza,
        "Ghana" to R.drawable.flag_ghana,
        "Gibraltár" to R.drawable.flag_gibraltar,
        "Grécko" to R.drawable.flag_grecko,
        "Grónsko" to R.drawable.flag_gronsko,
        "Grenada" to R.drawable.flag_grenada,
        "Gruzínsko" to R.drawable.flag_gruzinsko,
        "Guadeloupe" to R.drawable.flag_guandeloupe,
        "Guatemala" to R.drawable.flag_guatemala,
        "Guernsey" to R.drawable.flag_guernsey,
        "Guinea" to R.drawable.flag_guinea,
        "Guinea-Bissau" to R.drawable.flag_guinea_bissau,
        "Guyana" to R.drawable.flag_guyana,
        "Haiti" to R.drawable.flag_haiti,
        "Holandsko" to R.drawable.flag_holandsko,
        "Honduras" to R.drawable.flag_honduras,
        "Hongkong" to R.drawable.flag_hong_kong,
        "India" to R.drawable.flag_india,
        "Indonézia" to R.drawable.flag_indonesia,
        "Irak" to R.drawable.flag_irak,
        "Irán" to R.drawable.flag_iran,
        "Írsko" to R.drawable.flag_irsko,
        "Island" to R.drawable.flag_island,
        "Izrael" to R.drawable.flag_izrael,
        "Jamajka" to R.drawable.flag_jamajka,
        "Japonsko" to R.drawable.flag_japonsko,
        "Jemen" to R.drawable.flag_jemen,
        "Jordánsko" to R.drawable.flag_jordansko,
        "Južná Afrika" to R.drawable.flag_juzna_afrika,
        "Kajmanie ostrovy" to R.drawable.flag_kajmanie,
        "Kambodža" to R.drawable.flag_kambodza,
        "Kamerun" to R.drawable.flag_kamerun,
        "Kanada" to R.drawable.flag_kanada,
        "Kapverdy" to R.drawable.flag_kapverdy,
        "Katar" to R.drawable.flag_katar,
        "Kazachstan" to R.drawable.flag_kazachstan,
        "Keňa" to R.drawable.flag_kenya,
        "Kirgizsko" to R.drawable.flag_kirgizsko,
        "Kiribati" to R.drawable.flag_kiribati,
        "Kolumbia" to R.drawable.flag_kolumbia,
        "Komory" to R.drawable.flag_komory,
        "Kongo" to R.drawable.flag_kongo,
        "Konžská demokratická republika" to R.drawable.flag_konzska_demokraticka,
        "Južná Kórea" to R.drawable.flag_juzna_korea,
        "Kostarika" to R.drawable.flag_kostarika,
        "Kuba" to R.drawable.flag_kuba,
        "Kuvajt" to R.drawable.flag_kuwait,
        "Severná Kórea" to R.drawable.flag_north_korea,
        "Laos" to R.drawable.flag_laos,
        "Lesotho" to R.drawable.flag_lesotho,
        "Libanon" to R.drawable.flag_libanon,
        "Libéria" to R.drawable.flag_liberia,
        "Líbya" to R.drawable.flag_libya,
        "Lichtenštajnsko" to R.drawable.flag_lichtenstajnsko,
        "Litva" to R.drawable.flag_litva,
        "Lotyšsko" to R.drawable.flag_lotyssko,
        "Luxembursko" to R.drawable.flag_luxembursko,
        "Macao" to R.drawable.flag_macao,
        "Madagaskar" to R.drawable.flag_madagaskar,
        "Maďarsko" to R.drawable.flag_madagaskar,
        "Malajzia" to R.drawable.flag_malajzia,
        "Malawi" to R.drawable.flag_malawi,
        "Maldivy" to R.drawable.flag_maldivy,
        "Malta" to R.drawable.flag_malta,
        "Maroko" to R.drawable.flag_maroko,
        "Marshallove ostrovy" to R.drawable.flag_marshallove,
        "Martinik" to R.drawable.flag_martinik,
        "Maurícius" to R.drawable.flag_mauricius,
        "Mauritánia" to R.drawable.flag_mauritania,
        "Mexiko" to R.drawable.flag_mexiko,
        "Mikronézia" to R.drawable.flag_mikronezia,
        "Mjanmarsko" to R.drawable.flag_mjanmarsko,
        "Moldavsko" to R.drawable.flag_moldavsko,
        "Monako" to R.drawable.flag_monako,
        "Mongolsko" to R.drawable.flag_mongolsko,
        "Mozambik" to R.drawable.flag_mozambik,
        "Macedónsko" to R.drawable.flag_macedonsko,
        "Namíbia" to R.drawable.flag_namibia,
        "Nauru" to R.drawable.flag_nauru,
        "Nemecko" to R.drawable.flag_nemecko,
        "Nepál" to R.drawable.flag_nepal,
        "Niger" to R.drawable.flag_niger,
        "Nigéria" to R.drawable.flag_nigeria,
        "Nikaragua" to R.drawable.flag_nikaragua,
        "Nórsko" to R.drawable.flag_norsko
    )

    /**
     * Get flag questions
     *
     * Vrati list otazok vlajok.
     *
     * @return
     */
    fun getFlagQuestions(): ArrayList<question>{
        return super.getQuestionList("Ktorej krajine patrí táto vlajka?")
    }

    /**
     * Get random flag question
     *
     * Vrati nahodnu otazku z listu vlajok.
     *
     * @return
     */
    fun getRandomFlagQuestion(): question {
        return super.randomQuestion("Ktorej krajine patrí táto vlajka?")
    }
}