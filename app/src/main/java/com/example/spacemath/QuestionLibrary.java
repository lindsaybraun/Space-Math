package com.example.spacemath;

public class QuestionLibrary {
    private String questions [] = {
            "24 + 17 =",
            "32 + 13 =",
            "16 + 20 =",
            "63 + 25 ="

    };


    private String choices [][] = {
            {"31", "48", "41"},
            {"35", "45", "55"},
            {"36", "32", "26"},
            {"77", "87", "88"}
    };



    private String correctAnswers[] = {"41", "45", "36", "88"};

    private String subtractionQuestions [] = {
            "24 - 17 =",
            "32 - 13 =",
            "16 - 20 =",
            "63 - 25 ="

    };


    private String subtractionChoices [][] = {
            {"31", "48", "41"},
            {"35", "45", "55"},
            {"36", "32", "26"},
            {"77", "87", "88"}
    };



    private String subtractionCorrectAnswers[] = {"41", "45", "36", "88"};


    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = choices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = choices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = choices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswers[a];
        return answer;
    }

    public String getSubtractionQuestion(int a) {
        String question = subtractionQuestions[a];
        return question;
    }


    public String getSubtractionChoice1(int a) {
        String choice0 = subtractionChoices[a][0];
        return choice0;
    }


    public String getSubtractionChoice2(int a) {
        String choice1 = subtractionChoices[a][1];
        return choice1;
    }

    public String getSubtractionChoice3(int a) {
        String choice2 = subtractionChoices[a][2];
        return choice2;
    }

    public String getSubtractionCorrectAnswer(int a) {
        String answer = subtractionCorrectAnswers[a];
        return answer;
    }
}
