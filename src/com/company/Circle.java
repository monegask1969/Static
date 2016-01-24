package com.company;

/**
 * Created by uitschool JV on 1/24/2016.
 */
public class Circle extends Shape {
    protected int x,y,r;
    public Circle(int x, int y, int r, String color)
    {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle(x=" + x + "y=" + y + "radius=" + r + ", color= " + super.color + ")");
    }
}
