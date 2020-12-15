package com.lab7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Square(2));
        figures.add(new Rectangle(2, 10));
        figures.add(new Triangle(5, 10, 15));


        System.out.println(FigureController.MaxArea(figures).getClass().getSimpleName() + " has the biggest area: " + FigureController.MaxArea(figures).getArea());
        System.out.println(FigureController.MaxPerimeter(figures).getClass().getSimpleName() + " has the biggest perimeter: " + FigureController.MaxPerimeter(figures).getPerimeter());


        figures.add(new Figure() {
            final double radius = 10;

            @Override
            double getArea() {
                return (radius * radius * Math.PI);
            }

            @Override
            double getPerimeter() {
                return (2 * radius * Math.PI);
            }

        });

        System.out.println(FigureController.MaxArea(figures).getClass().getSimpleName() + " has the biggest area: " + FigureController.MaxArea(figures).getArea());
        System.out.println(FigureController.MaxPerimeter(figures).getClass().getSimpleName() + " has the biggest perimeter: " + FigureController.MaxPerimeter(figures).getPerimeter());

    }
}
