package com.company;

public abstract class Book {
   private String shifr;
   private String author;
   private String name;
   private int year;
   private String publish;
   public String getPublish(){
       return publish;
   }
   public int getYear(){
       return year;
   }
   public String getName(){
       return name;
   }
   public String getAuthor(){
       return author;
   }
   public String getShifr(){
       return shifr;
   }
   public Book(String shifr,String author,String name, int year,String publish){
       this.shifr=shifr;
       this.author=author;
       this.name=name;
       this.publish=publish;
       this.year=year;
   }

}
