package com.company;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(10);

        // Execution
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        System.out.println(circle1 == circle2);
        System.out.println(circle2 == circle3);
        System.out.println(circle2.equals(circle3));
        System.out.println(circle1.hashCode() == circle2.hashCode());
        System.out.println(circle2.hashCode() == circle3.hashCode());
    }
}
