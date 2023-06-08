package org.example_grp;

// Shape class (base class)
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class (derived class)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class (derived class)
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Triangle class (derived class)
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Triangle();

        // Calling the draw() method on each shape
        shape1.draw(); // calls the draw() method in the Circle class
        shape2.draw(); // calls the draw() method in the Rectangle class
        shape3.draw(); // calls the draw() method in the Triangle class
    }
}
