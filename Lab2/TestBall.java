package ru.mirea.gibo4.Lab2;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(2, "red");
        System.out.println("Weight ball " + b1.getWeight()
                +", color is " + b1.getColor());
        Ball b2 = new Ball(5, "blue");
        System.out.println("Weight ball " +b2.getWeight()
                +", color is " + b2.getColor());

        Ball b3 = new Ball( 4, "white");
        System.out.println("Weight ball " + b3.getWeight()
                +", color is " + b3.getColor());
    }
}
