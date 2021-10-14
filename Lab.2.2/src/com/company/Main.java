package com.company;

import java.util.Scanner;
import com.company.MyString;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [] s1 = new char[5];
        char [] s2 = new char[5];
        s1 = scanner.next().toCharArray();
        s2 = scanner.next().toCharArray();
        MyString s_1 = new MyString(s1);
        MyString s_2 = new MyString(s2);
        MyString s_3 = new MyString();
        if (s_1.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println("Not empty");
        }
        if(s_1.equals(s_1,s_2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        System.out.println((s_1.charAt(3)));
        s_1 = s_1.concat(s_1, s_2);
        System.out.println((s_1.length()));
        System.out.println(s_1.toString());
        s_3 = s_1.substring(4,7);
        System.out.println(s_3.toString());
        MyString trimTest = new MyString("   abcd   ");
        System.out.println(trimTest);
        System.out.println(trimTest.trim());
        MyString str = new MyString("a");
        MyString another = new MyString("b");
        System.out.println("Compare To 'a' b is : " + str.compareTo(another));
        System.out.println("Compare To 'b' a is : " + another.compareTo(str));
        System.out.println("Compare To 'b' b is : " + another.compareTo(another));
    }
}
