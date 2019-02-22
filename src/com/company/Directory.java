package com.company;

public class Directory extends Book{
    private int pages;
    public Directory(String shifr, String author, String name, int year, String publish,int pages) {
        super(shifr, author, name, year, publish);
        this.pages=pages;
    }
    public int getPages(){
        return pages;
    }


}
