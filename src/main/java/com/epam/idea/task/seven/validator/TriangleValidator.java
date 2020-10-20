package com.epam.idea.task.seven.validator;

import com.epam.idea.task.seven.data.SidesCreator;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class TriangleValidator {

    private SidesCreator side = new SidesCreator();

    public boolean isPointsTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        if (firstPoint.equals(secondPoint)) return false;
        if (secondPoint.equals(thirdPoint)) return false;
        if (firstPoint.equals(thirdPoint)) return false;
        double firstVectorX = secondPoint.getPointX() - firstPoint.getPointY();
        double firstVectorY = secondPoint.getPointY() - firstPoint.getPointY();
        double secondVectorX = thirdPoint.getPointX() - firstPoint.getPointY();
        double secondVectorY = thirdPoint.getPointY() - firstPoint.getPointY();
        return (firstVectorX / secondVectorX) != (firstVectorY / secondVectorY);
    }

    public double calculateArea(Triangle triangle) {
        double halfPerimeter = calculatePerimeter(triangle) / 2;
        double firstSide = halfPerimeter - side.getSideA(triangle);
        double secondSide = halfPerimeter - side.getSideB(triangle);
        double thirdSide = halfPerimeter - side.getSideC(triangle);
        return Math.sqrt(halfPerimeter * firstSide * secondSide * thirdSide);
    }


    public double calculatePerimeter(Triangle triangle) {
        double sideA = side.getSideA(triangle);
        double sideB = side.getSideB(triangle);
        double sideC = side.getSideC(triangle);
        return sideA + sideB + sideC;
    }

    public double calculateSide(Point a, Point b) {
        double deltaX = b.getPointX() - a.getPointY();
        double deltaY = b.getPointX() - a.getPointY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public boolean checkTriangleEquilateral(Triangle triangle) {
        double sideA = side.getSideA(triangle);
        double sideB = side.getSideB(triangle);
        double sideC = side.getSideC(triangle);
        return sideA == sideB && sideB == sideC;
    }

    public boolean checkTriangleIsosceles(Triangle triangle) {
        double sideA = side.getSideA(triangle);
        double sideB = side.getSideB(triangle);
        double sideC = side.getSideC(triangle);
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }

    public boolean checkTriangleRectangular(Triangle triangle) {
        double sideA = side.getSideA(triangle);
        double sideB = side.getSideB(triangle);
        double sideC = side.getSideC(triangle);

        boolean isAHypotenuse = sideA * sideA == (sideB * sideB + sideC * sideC);
        boolean isBHypotenuse = sideB * sideB == (sideA * sideA + sideC * sideC);
        boolean isCHypotenuse = sideC * sideC == (sideA * sideA + sideB * sideB);
        return isAHypotenuse || isBHypotenuse || isCHypotenuse;
    }

    public boolean checkTriangleObtuse(Triangle triangle) {
        double sideA = side.getSideA(triangle);
        double sideB = side.getSideB(triangle);
        double sideC = side.getSideC(triangle);

        boolean compareAWithBC = sideA * sideA > (sideB * sideB + sideC * sideC);
        boolean compareBWithAC = sideB * sideB > (sideA * sideA + sideC * sideC);
        boolean compareCWithAC = sideC * sideC > (sideA * sideA + sideB * sideB);
        return compareAWithBC || compareBWithAC || compareCWithAC;

    }
}
