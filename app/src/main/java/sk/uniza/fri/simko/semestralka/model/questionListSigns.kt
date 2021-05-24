package sk.uniza.fri.simko.semestralka.model

import sk.uniza.fri.simko.semestralka.R

object questionListSigns: questionList(){

    override var map: HashMap<String, Int>? =  hashMapOf(
        "Nebezpečenstvo" to R.drawable.sign_nebezpecenstvo,
        "Zákruta" to R.drawable.sign_zakruta,
        "Dvojitá zákruta" to R.drawable.sign_dvojita_zakruta,
        "Klesanie" to R.drawable.sign_klesanie,
        "Stúpanie" to R.drawable.sign_stupanie,
        "Zúžená vozovka" to R.drawable.sign_zuzena_vozovka,
        "Nerovnosť vozovky" to R.drawable.sign_nerovnost,
        "Nebezpečná krajnica" to R.drawable.sign_krajnica,
        "Nebezpečenstvo šmyku" to R.drawable.sign_smyk,
        "Sneh alebo poľadovica" to R.drawable.sign_sneh,
        "Štrk na vozovke" to R.drawable.sign_strk,
        "Padajúce kamene" to R.drawable.sign_kamene,
        "Bočný vietor" to R.drawable.sign_vietor,
        "Kolóny" to R.drawable.sign_kolony,
        "Práca" to R.drawable.sign_praca,
        "Obojsmerná premávka" to R.drawable.sign_obojsmer,
        "Svetelné signály" to R.drawable.sign_semafor,
        "Križovatka" to R.drawable.sign_pozor_krizovatka,
        "Pozor, chodci!" to R.drawable.sign_pozor_chodci,
        "Pozor, cyklisti!" to R.drawable.sign_pozor_cyklisti,
        "Pozor, deti!" to R.drawable.sign_pozor_deti,
        "Pozor, prechod pre chodcov!" to R.drawable.sign_pozor_prechod,
        "Chodci" to R.drawable.sign_chodci,
        "Cyklisti" to R.drawable.sign_cyklisti,
        "Zver" to R.drawable.sign_zver,
        "Priecestie" to R.drawable.sign_priecestie,
        "Návesť pred priecestím" to R.drawable.sign_priecestie_navest,
        "Výstražný kríž" to R.drawable.sign_priecestie_kriz,
        "Daj prednosť v jazde" to R.drawable.sign_prednost,
        "Stoj, daj prednosť v jazde" to R.drawable.sign_stop,
        "Prednosť protiidúcich vozidiel" to R.drawable.sign_prednost_proti,
        "Prikázaný smer jazdy" to R.drawable.sign_prikazany_smer_jazdy,
        "Prikázaný smer odbočenia" to R.drawable.sign_prikazany_smer_odbocenia,
        "Prikázaný smer obchádzania" to R.drawable.sign_prikazany_smer_obchadzania,
        "Kruhový objazd" to R.drawable.sign_kruhac,
        "Zákaz odbočenia" to R.drawable.sign_zakaz_odbocenia,
        "Zákaz otáčania" to R.drawable.sign_zakaz_otacania,
        "Vyhradený pruh pre verejný dopravu" to R.drawable.sign_mhd,
        "Zákaz vjazdu" to R.drawable.sign_zakaz_vjazdu,
        "Zákaz vjazdu pre všetky vozidlá" to R.drawable.sign_zakaz_vjazdu_oboj,
        "Zákaz vjazdu pre všetky motorové vozidlá" to R.drawable.sign_zakaz_vjazdu_motor,
        "Zákaz vjazdu pre vozidlá prepravujúce nebezpečné veci" to R.drawable.sign_zakaz_vjazdu_nebezpecne,
        "Zákaz vjazdu pre vozidlá prepravujúce náklad, ktorý môže spôsobiť znečistenie vody" to R.drawable.sign_zakaz_vjazdu_znecistenie,
        "Maximálna hmotnosť" to R.drawable.sign_max_hmotnost,
        "Maximálna šírka" to R.drawable.sign_max_sirka,
        "Maximálna výška" to R.drawable.sign_max_vyska,
        "Maximálna dĺžka" to R.drawable.sign_max_dlzka,
        "Najnižšia dovolená rýchlosť" to R.drawable.sign_min_rychlost,
        "Snehové reťaze" to R.drawable.sign_retaze,
        "Najvyššia dovolená rýchlosť" to R.drawable.sign_max_rychlost,
        "Zákaz predchádzania" to R.drawable.sign_zakaz_predchadzania,
        "Minimálna vzdialenosť medzi vozidlami" to R.drawable.sign_min_vzdialenost,
        "Koniec najvyššej dovolenej rýchlosti" to R.drawable.sign_koniec_max_rychlost,
        "Zóna najvyššej dovolenej rýchlosti" to R.drawable.sign_zona_max_rychlost,
        "Koniec viacerých zákazov" to R.drawable.sign_koniec_zakazov,
        "Zákaz zastavenia" to R.drawable.sign_zakaz_zastavenia,
        "Zákaz státia" to R.drawable.sign_zakaz_statia,
        "Parkovanie" to R.drawable.sign_parkovanie,
        "Hlavná cesta" to R.drawable.sign_hlavna
    )

    fun getSignQuestions(): ArrayList<question> {
        return super.getQuestionList("Čo znamená táto dopravná značka?")
    }

    fun getRandomSignQuestion(): question {
        return super.randomQuestion("Čo znamená táto dopravná značka?")
    }
}