package com.example.QuoteAPI.model;

import java.util.Objects;

public class QuoteofADay {

    private  int id;
    private String author;
    private  String quote;

    public QuoteofADay(){

    }
    public QuoteofADay(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteofADay quoteAPI = (QuoteofADay) o;
        return id == quoteAPI.id && Objects.equals(author, quoteAPI.author) && Objects.equals(quote, quoteAPI.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }

    @Override
    public String toString() {
        return "QuoteAPI{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
