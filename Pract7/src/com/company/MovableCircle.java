package com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        centre = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        centre.y = centre.y + centre.ySpeed;
    }

    @Override
    public void moveDown() {
        centre.y = centre.y - centre.ySpeed;
    }

    @Override
    public void moveRight() {
        centre.x = centre.x + centre.xSpeed;
    }

    @Override
    public void moveLeft() {
        centre.x = centre.x - centre.xSpeed;
    }

    @Override
    public MovableCircle copy() {
        return new MovableCircle(centre.x, centre.y, centre.xSpeed, centre.ySpeed, radius);
    }

    public String toString() {
        return "x: " + centre.x + ", y = " + centre.y + ", xSpeed: " + centre.xSpeed + ", ySpeed: " + centre.ySpeed + ", radius: " + radius;
    }
}