package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Encyclopedia en1=new Encyclopedia("tnr","Vasyan","Vasyanstvo",2049,"PROSVESHENIE","biblia");
        Directory dir1=new Directory("nvm","...","Telphone numbers",1999,"PROSVESHENIE",4422);
        System.out.println(dir1.getPages());
        System.out.println(en1.getName());
    }
}
