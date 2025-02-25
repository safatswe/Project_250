package com.example.quiz_app;

public class QuestionAnswer {

    public static String question [] = {
            "What is 10+26 ?",
            "Who invented the Telephone?",
            "What is 12*9 ?",
            "Who is the founder of SpaceX?",
            "Which is an example of System Software?",
            "What is the capital of France?",  // New question added
            "Which planet is known as the Red Planet?"  // Another new question added
    };

    public static String choices [][] = {
            {"32", "42", "36", "38"},
            {"Graham Bell", "Einstein", "Edison", "None of the above"},
            {"96", "84", "102", "108"},
            {"Jeff Bezos", "Elon Musk", "Steve Jobs", "Bill Gates"},
            {"Windows", "Linux", "MacOS", "All of the above"},
            {"London", "Berlin", "Paris", "Madrid"},  // Choices for new question
            {"Earth", "Mars", "Jupiter", "Saturn"}  // Choices for another new question
    };

    public static String correctAnswers [] = {
            "36",
            "Graham Bell",
            "108",
            "Elon Musk",
            "All of the above",
            "Paris",  // Correct answer for the new question
            "Mars"  // Correct answer for another new question
    };
}
