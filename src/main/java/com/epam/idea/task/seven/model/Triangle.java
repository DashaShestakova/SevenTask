package com.epam.idea.task.seven.model;

import java.util.Objects;

public class Triangle {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(firstPoint, triangle.firstPoint) &&
                Objects.equals(secondPoint, triangle.secondPoint) &&
                Objects.equals(thirdPoint, triangle.thirdPoint);
    }

    @Override
    public int hashCode() {
        int result = 17;
        int factor = 31;
        result = factor *  result + firstPoint.hashCode();
        result = factor *  result + secondPoint.hashCode();
        result = factor *  result + thirdPoint.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }
}
