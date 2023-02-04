package org.example;

import Solid.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        ShapesPrinter printer = new ShapesPrinter(
                areaCalculator);
        List<IShape> shapes =  List.of(circle,
                square,
                cube,
                rectangle);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

    }
}