package com.epam.idea.task.seven.repository.comparator;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

import java.util.Comparator;

public class TriangleXPointComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        Point firstTrianglePoint = firstTriangle.getFirstPoint();
        Point secondTrianglePoint = secondTriangle.getFirstPoint();
        double firstTrianglePointX = firstTrianglePoint.getPointX();
        double secondTrianglePointX = secondTrianglePoint.getPointX();
        return Double.compare(firstTrianglePointX, secondTrianglePointX);
    }
}
