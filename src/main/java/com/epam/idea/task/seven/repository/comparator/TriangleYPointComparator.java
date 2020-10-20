package com.epam.idea.task.seven.repository.comparator;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

import java.util.Comparator;

public class TriangleYPointComparator implements Comparator<Triangle > {
    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        Point firstTrianglePoint = firstTriangle.getFirstPoint();
        Point secondTrianglePoint = secondTriangle.getFirstPoint();
        double firstTrianglePointY = firstTrianglePoint.getPointX();
        double secondTrianglePointY = secondTrianglePoint.getPointX();
        return Double.compare(firstTrianglePointY, secondTrianglePointY);
    }
}
