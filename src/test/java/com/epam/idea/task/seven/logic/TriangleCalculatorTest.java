package com.epam.idea.task.seven.logic;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleCalculatorTest {
    private static final int id = 1;
    TriangleCalculator calculator = new TriangleCalculator();


    @Test
    public void testCalculatePerimeterWhenNumbersArePositive() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(0, 2);
        Point thirdPoint = new Point(3, 0);
        Triangle triangle = new Triangle(id, firstPoint, secondPoint, thirdPoint);
        double result = calculator.calculatePerimeter(triangle);
        assertEquals(result, 8.605, 0.01);
    }

    @Test
    public void testCalculatePerimeterWhenSomeNumbersAreNegative() {
        Point firstPoint = new Point(1, 1);
        Point secondPoint = new Point(-1, 1);
        Point thirdPoint = new Point(0, -1);

        Triangle triangle = new Triangle(id, firstPoint, secondPoint, thirdPoint);
        double result = calculator.calculatePerimeter(triangle);
        assertEquals(result, 6.472, 0.01);
    }

    @Test
    public void testCalculateAreaWhenNumbersArePositive() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(5, 0);
        Point thirdPoint = new Point(2, 3);
        Triangle triangle = new Triangle(id, firstPoint, secondPoint, thirdPoint);
        double result = calculator.calculateArea(triangle);
        assertEquals(result, 7.499, 0.01);
    }

    @Test
    public void testCalculateAreaWhenSomeNumbersAreNegative() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(-5, 0);
        Point thirdPoint = new Point(2, -8);

        Triangle triangle = new Triangle(id, firstPoint, secondPoint, thirdPoint);
        double result = calculator.calculateArea(triangle);
        assertEquals(result, 19.999, 0.01);
    }

    @Test
    public void testCalculateSizeWhenNumbersArePositive () {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(0, 2);
        double result = calculator.calculateSideSize(firstPoint, secondPoint);
        assertEquals(result, 2, 0.01);
    }

    @Test
    public void testCalculateSizeWhenSomeNumbersAreNegative() {
        Point firstPoint = new Point(0, -1);
        Point secondPoint = new Point(-1, 1);
        double result = calculator.calculateSideSize(firstPoint, secondPoint);
        assertEquals(result, 2.236, 0.01);
    }
}
