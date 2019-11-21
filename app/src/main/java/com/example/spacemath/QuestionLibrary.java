package com.example.spacemath;

import java.util.ArrayList;
import java.util.List;

public class QuestionLibrary {



    private String questions [] = {
            "24 + 17 =",
            "32 + 13 =",
            "16 + 20 =",
            "63 + 25 =",
            "5 + 2 =",
            "46 + 10 =",
            "27 + 49 =",
            "25 + 39 =",
            "62 + 18 ="

    };


    private String choices [][] = {
            {"31", "48", "41"},
            {"35", "45", "55"},
            {"36", "32", "26"},
            {"77", "87", "88"},
            {"7", "10", "9"},
            {"36","56", "55"},
            {"72","76", "71"},
            {"62","58","64"},
            {"75","80","69"}
    };



    private String correctAnswers[] = {"41", "45", "36", "88","7","56","76","64","80"};

    private String subtractionQuestions [] = {
            "24 - 17 =",
            "32 - 13 =",
            "20 - 16 =",
            "63 - 25 =",
            "84 - 32 =",
            "24 - 8 =",
            "78 - 20 =",
            "42 - 13 =",
            "112 - 56 ="

    };


    private String subtractionChoices [][] = {
            {"7", "5", "9"},
            {"9", "22", "19"},
            {"10", "4", "8"},
            {"38", "39", "40"},
            {"14","52","16"},
            {"50", "16","58"},
            {"29","28","58"},
            {"50","29","66"},
            {"56", "17","53"}

    };



    private String subtractionCorrectAnswers[] = {"7","19", "4", "38","52","16","58","29","56"};

    private String multiplicationQuestions [] = {
            "8 x 9 =",
            "10 x 82 =",
            "12 x 13 =",
            "9 x 19 =",
            "32 x 12 =",
            "30 x 15 =",
            "52 x 32 =",
            "21 x 4 =",
            "81 x 9 ="

    };


    private String multiplicationChoices [][] = {
            {"81", "72", "63"},
            {"800", "82", "820"},
            {"156", "166", "146"},
            {"171", "150", "168"},
            {"44","384","200"},
            {"400", "450","420"},
            {"2129","186","1664"},
            {"84","24","25"},
            {"728", "729","730"}
    };




    private String multiplicationCorrectAnswers[] = {"72","820", "156", "171","384","450","1664","84","729"};


    private String divisionQuestions [] = {
            "24 ÷ 12 =",
            "80 ÷ 4 =",
            "72 ÷ 7 =",
            "98 ÷ 9 =",
            "180 ÷ 3 =",
            "2250 ÷ 25=",
            "200 ÷ 25 =",
            "172 ÷ 4 =",
            "4218 ÷ 3 ="

    };


    private String divisionChoices [][] = {
            {"4", "2", "6"},
            {"40", "20", "76"},
            {"10 r 2", "10", "10 r 3"},
            {"9", "9 r 7", "9 r 6"},
            {"20","30","60"},
            {"60", "90","70"},
            {"14","12","8"},
            {"43","24","40"},
            {"1728", "1387","1406"}

    };



    private String divisionCorrectAnswers[] = {"2","20", "10 r 2", "9 r 7","60","90","8","43","1406"};




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

    public String getMultiplicationQuestions(int a) {
        String question = multiplicationQuestions[a];
        return question;
    }


    public String getMultiplicationChoice1(int a) {
        String choice0 = multiplicationChoices[a][0];
        return choice0;
    }


    public String getMultiplicationChoice2(int a) {
        String choice1 = multiplicationChoices[a][1];
        return choice1;
    }

    public String getMultiplicationChoice3(int a) {
        String choice2 = multiplicationChoices[a][2];
        return choice2;
    }

    public String getMultiplicationCorrectAnswer(int a) {
        String answer = multiplicationCorrectAnswers[a];
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

    public String getDivisionQuestions(int a) {
        String question = divisionQuestions[a];
        return question;
    }


    public String getDivisionChoice1(int a) {
        String choice0 = divisionChoices[a][0];
        return choice0;
    }


    public String getDivisionChoice2(int a) {
        String choice1 = divisionChoices[a][1];
        return choice1;
    }

    public String getDivisionChoice3(int a) {
        String choice2 = divisionChoices[a][2];
        return choice2;
    }

    public String getDivisionCorrectAnswer(int a) {
        String answer = divisionCorrectAnswers[a];
        return answer;
    }
}
