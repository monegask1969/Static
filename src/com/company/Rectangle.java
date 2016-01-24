package com.company;

/**
 * Created by uitschool JV on 1/24/2016.
 */
public class Rectangle extends Shape{
    protected int x,y,x1,y1;

    public Rectangle(int x, int y, int x1, int y1, String color)
    {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle(x=" + x + "y=" + y + "x1=" + x1 + "y1=" + y1 + ", color= " + super.color + ")");
    }
}
