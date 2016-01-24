package com.company;

/**
 * Created by uitschool JV on 1/24/2016.
 */
public abstract class Shape {
    protected String color = "red";

    public abstract void draw();

    public Shape(String color){this.color=color;}
}
