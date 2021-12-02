package com.company;

import com.company.MovableCircle;
import com.company.MovablePoint;
public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(7, 4, 3, 5);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveRight();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(6, 9, 5, 4, 7);
        MovableCircle Copy = movableCircle.copy();
        System.out.println("Before copying");
        System.out.println(movableCircle);
        System.out.println(Copy);
        movableCircle.moveUp();
        movableCircle.moveLeft();
        System.out.println("After copying");
        System.out.println(movableCircle);
        System.out.println(Copy);
    }
}