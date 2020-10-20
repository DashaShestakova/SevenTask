package com.epam.idea.task.seven.repository.specification;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Triangle;

public class TrianglesByAreaIntervalSpecification implements Specification {
    private final TriangleCalculator calculator = new TriangleCalculator();
    private final double firstArea;
    private final double secondArea;

    public TrianglesByAreaIntervalSpecification(double firstArea, double secondArea) {
        this.firstArea = firstArea;
        this.secondArea = secondArea;
    }

    @Override
    public boolean isSpecified(Triangle triangle) {
        double currentArea = calculator.calculateArea(triangle);
        boolean firstCondition = Double.compare(currentArea, firstArea) > 0;
        boolean secondCondition = Double.compare(secondArea, currentArea) > 0;
        return firstCondition && secondCondition;
    }
}
