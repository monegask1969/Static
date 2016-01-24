package com.company;

/**
 * Created by uitschool JV on 1/24/2016.
 */
public class Ball {
    public static int count = 0;

    static int getCountInstance(){return count;}

    private String color = "none";

    public Ball(String color)
    {
        this.color = color;
        count++;
    }
    protected void finalize()
    {
        System.out.println("ASD");
        count--;
    }
}
