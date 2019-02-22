package com.company;

public class Encyclopedia extends Book {
    private String subject;
    public Encyclopedia(String shifr, String author, String name, int year, String publish,String subject) {
        super(shifr, author, name, year, publish);
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }

}
