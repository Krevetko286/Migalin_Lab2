package ru.mirea.gibo4.Lab2;

import java.lang.*;
public class Ball {
    private String color;
    private int weight;
    public Ball() {
        color = "red";
        weight = 2;
    }
    public Ball(int w) {
        color = "blue";
        weight = w;
    }
    public Ball(int w, String c) {
        color = c;
        weight = w;
    }
    public int getWeight() { return weight; }
    public String getColor() { return color; }
}
