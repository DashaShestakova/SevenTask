package com.epam.idea.task.seven.repository.specification;

import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.model.Triangle;

public class TrianglesByPerimeterIntervalSpecification implements Specification {
    private final TriangleCalculator calculator = new TriangleCalculator();
    private final double firsPerimeter;
    private final double secondPerimeter;

    public TrianglesByPerimeterIntervalSpecification (double firstPerimeter, double secondPerimeter) {
        this.firsPerimeter = firstPerimeter;
        this.secondPerimeter = secondPerimeter;
    }

    @Override
    public boolean isSpecified (Triangle triangle) {
        double currentPerimeter = calculator.calculatePerimeter(triangle);
        boolean firstCondition = Double.compare(currentPerimeter, firsPerimeter) > 0;
        boolean secondCondition = Double.compare(secondPerimeter, currentPerimeter) > 0;
        return firstCondition && secondCondition;
    }

}
