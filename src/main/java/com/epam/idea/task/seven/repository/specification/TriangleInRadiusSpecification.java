package com.epam.idea.task.seven.repository.specification;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class TriangleInRadiusSpecification implements Specification{
    private final double radius;
    public TriangleInRadiusSpecification(double radius){
        this.radius = radius;
    }

    @Override
    public boolean isSpecified(Triangle triangle) {
        Point a = triangle.getFirstPoint();
        Point b = triangle.getSecondPoint();
        Point c = triangle.getThirdPoint();
        double radiusA = calcRadius(a);
        if(radius > radiusA){
            return true;
        }
        double radiusB = calcRadius(b);
        if(radius > radiusB) {
            return true;
        }
        double radiusC = calcRadius(c);
        return radius > radiusC;
    }
    private double calcRadius(Point p){
        double x = p.getPointX();
        double y = p.getPointY();
        return Math.hypot(x, y);
    }
}
