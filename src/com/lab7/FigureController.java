package com.lab7;

import java.util.ArrayList;

public class FigureController {

    public static Figure MaxArea(ArrayList<Figure> figures) {
        Figure maxAreaFigure = null;
        double maxArea = 0;

        for (Figure f : figures) {

            if (f.getArea() > maxArea) {
                maxArea = f.getArea();
                maxAreaFigure = f;
            }
        }
        return maxAreaFigure;
    }

    public static Figure MaxPerimeter(ArrayList<Figure> figures) {
        Figure maxPerimeterFigure = null;
        double maxPerimeter = 0;

        for (Figure f : figures) {

            if (f.getPerimeter() > maxPerimeter) {
                maxPerimeter = f.getPerimeter();
                maxPerimeterFigure = f;
            }
        }
        return maxPerimeterFigure;
    }
}
