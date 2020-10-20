package com.epam.idea.task.seven.repository.comparator;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Triangle;

import java.util.Comparator;

public class TriangleAreaComparator implements Comparator<Triangle> {
    private final TriangleCalculator calculator = new TriangleCalculator();

    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        double area1 = calculator.calculateArea(firstTriangle);
        double area2 = calculator.calculateArea(secondTriangle);
        return Double.compare(area1, area2);
    }
}

