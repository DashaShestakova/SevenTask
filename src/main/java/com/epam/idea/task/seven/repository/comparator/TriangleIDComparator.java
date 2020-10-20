package com.epam.idea.task.seven.repository.comparator;

import com.epam.idea.task.seven.model.Triangle;

import java.util.Comparator;

public class TriangleIDComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle firstTriangle, Triangle secondTriangle) {
        int firstID = firstTriangle.getId();
        int secondID = secondTriangle.getId();
        return Integer.compare(firstID, secondID);
    }
}
