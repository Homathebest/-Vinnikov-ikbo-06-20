package com.company;
import java.util.Scanner;

public class PersonTest {

    public void test() {
        Person pers = new Person();
        System.out.println("Введите имя, рост, возраст: ");
        Scanner scan = new Scanner(System.in);
        pers.setName(scan.next());
        pers.setHeight(scan.nextFloat());
        pers.setAge(scan.nextInt());
        pers.setGender(Person.Gender.OTHER);

        System.out.println("Name: " + pers.getName() + " Height: " + pers.getHeight() + " Age: " + pers.getAge());
    }
}