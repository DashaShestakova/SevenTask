package com.epam.idea.task.seven.model;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Point;

import java.util.Objects;

public class Triangle {
    private int id;
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle(int id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.id = id;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public boolean equals(Object obj) {
        if (obj==this)
            return true;
        if (obj==null||obj.getClass()!=this.getClass())
            return false;
        Triangle triangle=(Triangle)obj;
        return (triangle.getFirstPoint().equals(this.getFirstPoint())
                && triangle.getSecondPoint().equals(this.getSecondPoint())
                && triangle.getThirdPoint().equals(this.getThirdPoint()));

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
