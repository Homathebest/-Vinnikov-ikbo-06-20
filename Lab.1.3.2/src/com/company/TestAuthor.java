package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author Auth = new Author("Tan Ah Teck", 'm', "ahTeck@somewhere.com");
        System.out.println(Auth);
        Auth.setEmail("nikolai@gmail.com");
        System.out.println(Auth);
    }
}