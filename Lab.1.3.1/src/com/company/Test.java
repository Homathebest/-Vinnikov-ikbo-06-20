package com.company;

public class Test {

    public static void main(String[] args) {
        Ball ball = new Ball("Nike", 6);

        Book book = new Book("War & Peace");
        book.setPages(354);

        System.out.println(ball);
        System.out.println(book);
    }
}