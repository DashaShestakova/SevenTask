package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class SidesCreator {

    public double calculateSideSize(Point firstPoint, Point secondPoint) {
        double vectorX = Math.pow(secondPoint.getPointX() - firstPoint.getPointX(), 2);
        double vectorY = Math.pow(secondPoint.getPointY() - firstPoint.getPointY(), 2);
        return Math.sqrt(vectorX + vectorY);
    }

    public double getSideA(Triangle triangle) {
        return calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
    }

    public double getSideB(Triangle triangle) {
        return calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
    }

    public double getSideC(Triangle triangle) {
        return calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());
    }
}
