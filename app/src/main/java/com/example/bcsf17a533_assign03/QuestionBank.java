package com.example.bcsf17a533_assign03;

public class QuestionBank {
    // array of questions
    private String textQuestions [] = {
            "1. When did PAKISTAN join the UN?",
            "2. Gadder Port is constructed in the province of?",
            "3. how many stanzas are there in pakistan national anthem?",
            "4.What was the old name of PIA:?",
            "5.What official name was given to Pakistan in 1956 constitution?",
            "6.Who was the Prime Minister of Pakistan during enforcement of first constitution?",
            "7.What is the other name of Mohammad Ali Bogra Formula?",
            "8.Who was the Muhammad ali bogra?",
            "9.What document was firstly drafted to give pace to constitution making process?",
            "10.When the Constituent Assembly passed the Objective Resolution?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"October 30,1947", "October 30,1945", "September 30,1948", "September 30,1945"},
            {"Punjab", "Sindhi", "Kpk", "Baluchistan"},
            {"One", "Two", "Three", "Four"},
            {"Independence airways", "Orient airways", "Kalochi airways", "Pakistan airways"},
            {"Islamic Pakistan","Islamic Republic of Pakistan","Republic Pakistan","United states of pakistan"},
            {"Khaja Nazam udin","Muhammad ali bogra","Ibrahim Ismaeil chundrigar","Chudary Muhammad Ali"},
            {"Constitutional formula","New law of pakistan","pakistan report","Third report"},
            {"Law Minister","Foreign Minister","Prime minister","Parliment Minister"},
            {"Pakistan Act","Independence Act","Objective resolution","Representative Act"},
            {"9th june 1949","14th Feb 1949","15th August 1949","12th March 1949"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"October 30,1945", "Baluchistan", "Three", "Orient airways","Islamic Republic of Pakistan","Chudary Muhammad Ali","Third report","Law Minister","Objective resolution","12th March 1949"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
