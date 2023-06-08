package org.example_grp;


class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}


class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw(); 
        shape2.draw(); 

    }
}
