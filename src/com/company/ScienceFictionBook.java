package com.company;

public class ScienceFictionBook extends Book {

    public String subject;      //e.g. Technology, time travel, etc.

    public ScienceFictionBook(String title, String author, int years,String subject){
        super(title,author,years);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void print(){
        super.print();
        System.out.println("Subject: " + subject);
    }
}
