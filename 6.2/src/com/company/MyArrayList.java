package com.company;

import java.util.Scanner;

public class MyArrayList {

    private Object[] Object;
    private int size = 0;

    public MyArrayList() {
        Object = new Object[size];
    }

    public MyArrayList(int size) {
        Scanner scan = new Scanner(System.in);
        Object = new Object[this.size];
        for (int i = 0; i < size; i++) {
            Object obj;
            obj = scan.next();
            add(obj);
        }
    }

    public void add(Object item) {
        Object[] obj = new Object[Object.length + 1];
        for (int i = 0; i < Object.length; i++) {
            obj[i] = Object[i];
        }
        Object = obj;
        Object[size] = item;
        size++;
    }

    public void add(Object item, int index) {
        Object[] obj = new Object[Object.length + 1];
        for (int i = 0; i < index; i++) {
            obj[i] = Object[i];
        }
        obj[index] = item;
        for (int i = index + 1; i < Object.length + 1; i++) {
            obj[i] = Object[i - 1];
        }
        Object = obj;
        size = size + 1;
    }

    public void clear() {
        Object = new Object[0];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String Array ="";
        if(size == 0){
            Array = "[]";
        }
        else {
            for (int i = 0; i < size; i++) {
                if (Array == "") {
                    Array = Array + "[" + Object[i];
                }
                else if (i == size - 1) {
                    Array = Array + ", " + Object[i] + "]";
                }
                else {
                    Array = Array + ", " + Object[i];
                }
            }
        }
        return Array;
    }
}