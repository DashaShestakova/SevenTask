package com.epam.idea.task.seven.logic;

import com.epam.idea.task.seven.data.SidesCreator;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleCalculator {
    private Logger logger = LogManager.getLogger();

    private SidesCreator sides = new SidesCreator();

    public double calculateSideSize(Point firstPoint, Point secondPoint) {
        double vectorX = Math.pow(secondPoint.getPointX() - firstPoint.getPointX(), 2);
        double vectorY = Math.pow(secondPoint.getPointY() - firstPoint.getPointY(), 2);
        return Math.sqrt(vectorX + vectorY);
    }

    public double calculatePerimeter(Triangle triangle) {
        double firstSide = sides.getSideA(triangle);
        double secondSide = sides.getSideB(triangle);
        double thirdSide = sides.getSideC(triangle);
        double perimeter = firstSide + secondSide + thirdSide;
        logger.info("Triangle perimeter is " + perimeter);
        return perimeter;
    }


    public double calculateArea(Triangle triangle) {
        double halfPerimeter = calculatePerimeter(triangle) / 2;

        double firstSide = sides.getSideA(triangle);
        double secondSide = sides.getSideB(triangle);
        double thirdSide = sides.getSideC(triangle);
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide)
                * (halfPerimeter - secondSide)
                * (halfPerimeter - thirdSide));
        logger.info("Triangle area is " + area);
        return area;
    }
}

