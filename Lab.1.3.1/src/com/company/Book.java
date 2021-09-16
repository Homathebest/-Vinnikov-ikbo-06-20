package com.company;

public class Book {
    public int pages;
    public String name;
    public Book (String n) {
        name = n;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String getName(String name){
        return name;
    }

    public int getPages(int pages){
        return pages;
    }

    public String toString() {
        return this.name + ", pages - " + this.pages;
    }

}