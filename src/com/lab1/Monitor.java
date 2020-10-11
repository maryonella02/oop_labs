package com.lab1;

import java.util.Objects;

public class Monitor {
    private String color;
    private int dimensions;
    private String resolution;

    public Monitor(String color, int dimensions, String resolution){
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return color.equals(monitor.color) &&
                dimensions == monitor.dimensions &&
                resolution.equals(monitor.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, dimensions, resolution);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public int getDimensions() {
        return dimensions;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "color='" + color + '\'' +
                ", dimensions=" + dimensions +  " inch" +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
