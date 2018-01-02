package com.company;

public class DramaPrintedBook extends DramaBook implements PrintedBook {

    public String dimensions,weight;

    public DramaPrintedBook(String title, String author, int years, String time, String place,String dimensions, String weight){
        super(title, author, years, time, place);
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public String getDimensions(){
        return dimensions;
    }
    public String getWeight(){
        return weight;
    }

    public void print(){
        super.print();
        System.out.println("Dimensions: " + dimensions +"\nWeight: " + weight);
    }
}
