package com.company;

public class DramaBook extends Book{

    public String time, place;

    //Constructor
    public DramaBook(String title, String author, int years, String time, String place){
        super(title, author, years);
        this.time = time;
        this.place = place;
    }

    //Methods
    public String getTime(){
        return time;
    }

    public String getPlace(){
        return place;
    }

    public void print(){
        super.print();
        System.out.println("Time: " + time + "\nPlace: " + place);
    }
}
