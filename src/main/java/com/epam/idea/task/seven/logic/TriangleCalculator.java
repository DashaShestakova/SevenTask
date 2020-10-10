package com.epam.idea.task.seven.logic;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class TriangleCalculator {
    public static double calculatePerimeter(Triangle triangle) {
        double firstSide = calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());
        return firstSide + secondSide + thirdSide;
    }

    public static double calculateSideSize(Point firstPoint, Point secondPoint) {
        double vectorX = Math.pow(secondPoint.getPointX() - firstPoint.getPointX(), 2);
        double vectorY = Math.pow(secondPoint.getPointY() - firstPoint.getPointY(), 2);
        return Math.sqrt(vectorX + vectorY);
    }

    public static double calculateArea(Triangle triangle) {
        double halfPerimeter = TriangleCalculator.calculatePerimeter(triangle) / 2;

        double firstSide = TriangleCalculator.calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = TriangleCalculator.calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = TriangleCalculator.calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());

        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }


}
