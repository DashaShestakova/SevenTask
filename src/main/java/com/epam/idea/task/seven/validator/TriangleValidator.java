package com.epam.idea.task.seven.validator;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class TriangleValidator {

    public static boolean isPointsTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        if (firstPoint.equals(secondPoint) || secondPoint.equals(thirdPoint) || firstPoint.equals(thirdPoint)){
            return false;
        }
        double firstSide = TriangleCalculator.calculateSideSize(firstPoint, secondPoint);
        double secondSide = TriangleCalculator.calculateSideSize(secondPoint, thirdPoint);
        double thirdSide = TriangleCalculator.calculateSideSize(thirdPoint, firstPoint);

        boolean firstCondition = (firstSide < secondSide + thirdSide);
        boolean secondCondition = (secondSide < firstSide + thirdSide);
        boolean thirdCondition = (thirdSide < firstSide + secondSide);
        return firstCondition || secondCondition || thirdCondition;
    }

    public static boolean isRightTriangle(Triangle triangle) {
        double firstSide = TriangleCalculator.calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = TriangleCalculator.calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = TriangleCalculator.calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());

        boolean firstCondition = (firstSide == Math.hypot(secondSide, thirdSide));
        boolean secondCondition = (secondSide == Math.hypot(firstSide, thirdSide));
        boolean thirdCondition = (thirdSide == Math.hypot(firstSide, secondSide));

        return firstCondition || secondCondition || thirdCondition;
    }

    public static boolean isRectangularTriangle(Triangle triangle) {
        double firstSide = TriangleCalculator.calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = TriangleCalculator.calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = TriangleCalculator.calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());

        boolean condition = false;
        if(firstSide > secondSide & firstSide > thirdSide){
            if(Math.pow(firstSide, 2) == Math.hypot(secondSide, thirdSide)){
                condition = true;
            }
        }else if (secondSide > firstSide & secondSide > thirdSide){
            if (Math.pow(secondSide, 2) == Math.hypot(firstSide, thirdSide)){
                condition = true;
            }
        }else if(thirdSide > secondSide & thirdSide > firstSide){
            if(Math.pow(thirdSide, 2) == Math.hypot(firstSide, secondSide)){
                condition = true;
            }
        }

        return condition;
    }

    public static boolean isEquilateralTriangle(Triangle triangle) {
        double firstSide = TriangleCalculator.calculateSideSize(triangle.getFirstPoint(), triangle.getSecondPoint());
        double secondSide = TriangleCalculator.calculateSideSize(triangle.getSecondPoint(), triangle.getThirdPoint());
        double thirdSide = TriangleCalculator.calculateSideSize(triangle.getThirdPoint(), triangle.getFirstPoint());

        boolean firstCondition = firstSide == secondSide;
        boolean secondCondition = secondSide == thirdSide;
        boolean thirdCondition = thirdSide == firstSide;

        return firstCondition || secondCondition || thirdCondition;
    }

}
