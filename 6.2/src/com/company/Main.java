package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList Array = new MyArrayList();
        System.out.println("Массив Array: " + Array.toString());
        System.out.println("Массив пуст: " + Array.isEmpty());
        System.out.println("Размер массива Array: " + Array.size());
        System.out.println("Добавим элементы: 1, 3, 5, 7, 9: ");

        Array.add(1);
        Array.add(3);
        Array.add(5);
        Array.add(7);
        Array.add(9);

        System.out.println("Массив Array: " + Array.toString());
        System.out.println("Добавим шестерку в позицию с индексом 3:");
        Array.add('6', 3);
        System.out.println("Массив Array: " + Array.toString());
        Array.clear();
        System.out.println("Массив очищен.");
        System.out.println("Массив Array: " + Array.toString());

        int size = 7;
        System.out.println("Введите " + size + " элементов массива: ");

        MyArrayList Array2 = new MyArrayList(size);
        System.out.println("Массив Array2: " + Array2.toString());
        System.out.println("Размер массива Array2: " + Array2.size());
        System.out.println("Массив пуст: " + Array2.isEmpty());
    }
}