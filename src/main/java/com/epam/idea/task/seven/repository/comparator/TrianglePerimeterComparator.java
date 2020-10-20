package com.epam.idea.task.seven.repository.comparator;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Triangle;

import java.util.Comparator;

public class TrianglePerimeterComparator implements Comparator<Triangle> {
    private final TriangleCalculator calculator = new TriangleCalculator();

    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        double perimeter1 = calculator.calculatePerimeter(firstTriangle);
        double perimeter2 = calculator.calculatePerimeter(secondTriangle);
        return Double.compare(perimeter1, perimeter2);
    }
}
