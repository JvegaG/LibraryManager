package com.company;

public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook,eBook {

    public int numberOfTracks;
    public String size;

    public ScienceFictioneAudioBook(String title, String author, int years,String subject,int numberOfTracks, String size){
        super(title,author,years,subject);
        this.numberOfTracks = numberOfTracks;
        this.size =  size;
    }

    @Override
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String getSize() {
        return size;
    }

    public void print(){
        super.print();
        System.out.println("Number of Tracks: " + numberOfTracks + "\nSize: " + size);
    }


}
