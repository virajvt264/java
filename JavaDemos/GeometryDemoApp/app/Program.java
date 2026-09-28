package app;

import Geometry.*;

class Program{

    public static void main(String[] args) {
        Shape s1 = new Square(30.0);
        Shape s2 = new Circle(30.0);

        System.out.printf("Area of Square : %f%n", s1.Area());
        System.out.printf("Area of Circle : %f%n", s2.Area());;
    }


}