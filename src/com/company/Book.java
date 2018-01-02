package com.company;

public class Book {

    //Attributes
    public String title, author;
    public int yearOfPublication;

    //Constructor
    public Book(String title, String author, int years){
        this.title = title;
        this.author = author;
        this.yearOfPublication = years;
    }

    /** Methods */
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void print(){
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() +
                            "\nYear of publication: " + getYearOfPublication());
    }
}
