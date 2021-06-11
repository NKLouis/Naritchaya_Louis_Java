package com.example.QuoteAPI.model;

import java.util.Objects;

public class MagicAnswers {

    private int id;
    private  String question;
    private  String answer;

    public MagicAnswers(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    public MagicAnswers(int id, String answer){

        this.id = id;
        this.answer = answer;
    }
    public MagicAnswers(int id, String i_have_no_idea, MagicAnswers magicAnswers){


    }

    public MagicAnswers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicAnswers answer1 = (MagicAnswers) o;
        return id == answer1.id && Objects.equals(question, answer1.question) && Objects.equals(answer, answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
