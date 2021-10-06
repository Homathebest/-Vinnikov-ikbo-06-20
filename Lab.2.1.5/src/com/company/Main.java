package com.company;

public class Main {

    public static String task1(int n) {
        int sum = 0;
        int j = 0;

        if (n == 1) {
            System.out.print("1");
        }
        else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(task1(--n) + " " + j);
        }
        return "";
    }

    public static String task2(int n) {
        if (n == 1) {
            return "1";
        }
        return task2(n - 1) + " " + n;
    }

    public static String task3(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + task3(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + task3(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Треугольная последовательность");
        task1(21); //n менять тут
        System.out.println();

        System.out.print("От 1 до n");
        System.out.println("\n" + task2(12)); //n менять тут

        System.out.println("От A до B");
        System.out.println(task3(5, 17)); //a и b меянть тут
    }
}
