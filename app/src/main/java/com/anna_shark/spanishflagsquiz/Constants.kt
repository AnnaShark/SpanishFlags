package com.anna_shark.spanishflagsquiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct _answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        // 1
        val que1 = Question(
            1, "What comunidad autónoma does this flag belong to?",
            R.drawable.larioja,
            "Galicia", "Castilla-La Mancha",
            "La Rioja", "Extremadura", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What comunidad autónoma does this flag belong to?",
            R.drawable.ceuta,
            "Ceuta", "Asturias",
            "Andalucía", "Castilla y León", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What comunidad autónoma does this flag belong to?",
            R.drawable.galicia,
            "Canarias", "Balears",
            "Murcia", "Galicia", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What comunidad autónoma does this flag belong to?",
            R.drawable.euskadi,
            "Andalucía", "Aragón",
            "País Vasco", "Cataluña", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What comunidad autónoma does this flag belong to?",
            R.drawable.castilla_leon,
            "Galicia", "Navarra",
            "La Rioja", "Castilla y León", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What comunidad autónoma does this flag belong to?",
            R.drawable.canarias,
            "Canarias", "Castilla-La Mancha",
            "Ceuta", "La Rioja", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What comunidad autónoma does this flag belong to?",
            R.drawable.valencia,
            "Balears", "Valencia",
            "Cataluña", "Aragón", 2
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What comunidad autónoma does this flag belong to?",
            R.drawable.asturias,
            "Asturias", "Canarias",
            "Galicia", "Melilla", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What comunidad autónoma does this flag belong to??",
            R.drawable.castilla_mancha,
            "Canarias", "Castilla y León",
            "La Rioja", "Castilla-La Mancha", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What comunidad autónoma does this flag belong to?",
            R.drawable.baleares,
            "Balears", "Ceuta",
            "Cataluña", "Galicia", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "What comunidad autónoma does this flag belong to?",
            R.drawable.extremadura,
            "Extremadura", "Canarias",
            "La Rioja", "Valencia", 1
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "What comunidad autónoma does this flag belong to?",
            R.drawable.catalunya,
            "Cantabria", "Valencia",
            "Madrid", "Cataluña", 4
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "What comunidad autónoma does this flag belong to?",
            R.drawable.melilla,
            "Andalucía", "Melilla",
            "Castilla-La Mancha", "Cataluña", 2
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "What comunidad autónoma does this flag belong to?",
            R.drawable.murcia,
            "Cataluña", "Murcia",
            "Aragón", "Andalucía", 2
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "What comunidad autónoma does this flag belong to?",
            R.drawable.navarra,
            "Murcia", "Cataluña",
            "Extremadura", "Navarra", 4
        )

        questionsList.add(que15)

        // 16
        val que16 = Question(
            16, "What comunidad autónoma does this flag belong to?",
            R.drawable.cantabria,
            "Madrid", "Asturias",
            "Castilla-La Mancha", "Cantabria", 4
        )

        questionsList.add(que16)

        // 17
        val que17 = Question(
            17, "What comunidad autónoma does this flag belong to?",
            R.drawable.aragona,
            "La Rioja", "Ceuta",
            "Aragón", "Balears", 3
        )

        questionsList.add(que17)

        // 18
        val que18 = Question(
            18, "What comunidad autónoma does this flag belong to?",
            R.drawable.madrid,
            "Castilla-La Mancha", "Navarra",
            "Madrid", "Valencia", 3
        )

        questionsList.add(que18)


        // 19
        val que19 = Question(
            19, "What comunidad autónoma does this flag belong to?",
            R.drawable.andalucia,
            "País Vasco", "Andalucía",
            "Navarra", "Extremadura", 2
        )

        questionsList.add(que19)

        return questionsList
    }
}