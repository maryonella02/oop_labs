package com.lab8;

import com.lab8.GeometricBody;

import java.util.ArrayList;

public class GeometricBodyController {

    public static GeometricBody MaxSurface(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody maxAreaFigure = null;
        double maxArea = 0;

        for (GeometricBody body : geometricBodies) {

            if (body.getSurface() > maxArea) {
                maxArea = body.getSurface();
                maxAreaFigure = body;
            }
        }
        return maxAreaFigure;
    }

    public static GeometricBody MaxVolume(ArrayList<GeometricBody> figures) {
        GeometricBody maxVolumeFigure = null;
        double maxVolume = 0;

        for (GeometricBody f : figures) {

            if (f.getVolume() > maxVolume) {
                maxVolume = f.getVolume();
                maxVolumeFigure = f;
            }
        }
        return maxVolumeFigure;
    }
}
