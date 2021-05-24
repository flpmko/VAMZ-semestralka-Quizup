package sk.uniza.fri.simko.semestralka.model

abstract class questionList {
    open var map: HashMap<String, Int>? = null

    fun getQuestionList(question: String): ArrayList<question> {
        val questionList = ArrayList<question>()
        var img = 0
        var idCorrect = 0
        var optionList: ArrayList<String> = randomOption()
        val backupMap:HashMap<String, Int> = map?.clone() as HashMap<String, Int>

        for (i in 1..10) {
            idCorrect = (1..4).random()
            optionList = randomOption()
            img = map?.get(optionList[idCorrect - 1])!!
            val question = question(
                i,
                question,
                img,
                optionList[0],
                optionList[1],
                optionList[2],
                optionList[3],
                idCorrect
            )
            questionList.add(question)

            //odstranit pridanu otazku z hashMap
            map!!.remove(optionList[idCorrect - 1])
        }

        this.map = backupMap
        return questionList
    }

    fun randomQuestion(p_question: String): question {
        val optionList = randomOption()
        val idCorrect = (1..4).random()
        val img = map?.get(optionList[idCorrect - 1])!!
        return question(
            1,
            p_question,
            img,
            optionList[0],
            optionList[1],
            optionList[2],
            optionList[3],
            idCorrect
        )
    }

    private fun randomOption(): ArrayList<String>{
        val optionList = ArrayList<String>()
        var different = true

        val option1: String = map?.keys?.random()!!
        var option2: String = map?.keys?.random()!!
        var option3: String = map?.keys?.random()!!
        var option4: String = map?.keys?.random()!!

        while (different){
            if (option1 == option2){
                option2 = map?.keys?.random()!!
            } else if (option1 == option3){
                option3 = map?.keys?.random()!!
            } else if (option1 == option4) {
                option4 = map?.keys?.random()!!
            } else if (option2 == option3) {
                option3 = map?.keys?.random()!!
            } else if (option2 == option4) {
                option4 = map?.keys?.random()!!
            } else if (option3 == option4) {
                option4 = map?.keys?.random()!!
            } else {
                different = false
            }
        }

        optionList.add(option1)
        optionList.add(option2)
        optionList.add(option3)
        optionList.add(option4)

        return optionList
    }
}