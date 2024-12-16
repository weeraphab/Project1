package models;

public class Question {
    private final String question;
    private final String[] choices;
    private final int correctAnswerIndex;

    public Question(String question, String[] choices, int correctAnswerIndex) {
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean isCorrect(int index) {
        return index == correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }
}
