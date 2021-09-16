package com.company;
import java.util.Scanner;

public class PersonExTest {

    public void test() {
        PersonEx pers = new PersonEx();
        System.out.println("Введите имя, рост и возраст: ");
        Scanner scan = new Scanner(System.in);

        try {
            pers.setName(scan.nextLine());
            pers.setHeight(scan.nextFloat());
            pers.setAge(scan.nextInt());
        } catch (Exception var7) {
            System.out.println(var7.getMessage());
            System.exit(0);
        } finally {
            System.out.println("Name: " + pers.getName());
            System.out.println("Height: " + pers.getHeight());
            System.out.println("Age: " + pers.getAge());
        }

    }
}