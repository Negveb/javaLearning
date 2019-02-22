package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] theme = {
                "Math",
                "Russian language",
                "Biology",
                "Chemical",
                "Music",
                "Art",
                "IT",
                "Random"
        };
        Encyclopedia en1 = new Encyclopedia("tnr", "Vasyan", "Vasyanstvo", 2049, "PROSVESHENIE", "biblia");
        Directory dir1 = new Directory("nvm", "...", "Telphone numbers", 1999, "PROSVESHENIE", 4422);
        Encyclopedia[] masE = new Encyclopedia[1000];
        for (int i = 0; i < 100; i++) {
            masE[i] = new Encyclopedia("TimesNewRoman", "Someone", "DatThing", 2000 - (i * 1111 / 1000), "PeppaProduction", theme[i % theme.length]);

        }
        dir1.addEncyclopedia(masE);
        System.out.println(en1.getName());
    }
}
