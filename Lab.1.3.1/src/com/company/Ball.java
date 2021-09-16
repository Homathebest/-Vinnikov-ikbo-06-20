package com.company;

public class Ball {
    public int size;
    public String brand;
    public Ball (String b, int s) {
        brand = b;
        size = s;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return this.brand + ", size - " + this.size;
    }
}