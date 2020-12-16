package com.lab8;

import com.lab7.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(new Cube(2));
        bodies.add(new Sphere(20.5));
        bodies.add(new Parallelepiped(5, 10, 13));

        System.out.println(GeometricBodyController.MaxSurface(bodies).getClass().getSimpleName() + " has the biggest surface area: " + GeometricBodyController.MaxSurface(bodies).getSurface());
        System.out.println(GeometricBodyController.MaxVolume(bodies).getClass().getSimpleName() + " has the biggest volume: " + GeometricBodyController.MaxVolume(bodies).getVolume());
    }
}
