package com.company;

public class Directory extends Book {
    private Encyclopedia[] encyclopedia;
    private int lines;
    static private int lot = 0;

    public Directory(String shifr, String author, String name, int year, String publish, int lines) {
        super(shifr, author, name, year, publish);
        this.lines = lines;
        encyclopedia = new Encyclopedia[lines];
    }

    public void addEncyclopedia(Encyclopedia encyclopedia) {
        if (lot + 1 <= lines) {
            this.encyclopedia[lot] = encyclopedia;
            lot++;
        } else System.out.println("Место в справочнике закончилось");
    }

    public void addEncyclopedia(Encyclopedia... encyclopedia) {
        for (Encyclopedia i : encyclopedia)
            addEncyclopedia(i);
    }

    public int getLines() {
        return encyclopedia.length;
    }


}
