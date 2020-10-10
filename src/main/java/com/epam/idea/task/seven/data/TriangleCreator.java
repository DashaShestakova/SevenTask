package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.exception.DataException;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

public class TriangleCreator {
    private final int AMOUNT_OF_PARAMETERS = 6;

    public Triangle createTriangle(double[] triangleParameters) throws DataException {
        if (triangleParameters.length != AMOUNT_OF_PARAMETERS) {
            throw new DataException("invalid parameters");
        }

        Point firstPoint = new Point(triangleParameters[Coordinates.X1.ordinal()],
                triangleParameters[Coordinates.Y1.ordinal()]);
        Point secondPoint = new Point(triangleParameters[Coordinates.X2.ordinal()],
                triangleParameters[Coordinates.Y2.ordinal()]);
        Point thirdPoint = new Point(triangleParameters[Coordinates.X3.ordinal()],
                triangleParameters[Coordinates.Y3.ordinal()]);

        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        return triangle;
    }

    private enum Coordinates {
        X1, Y1, X2, Y2, X3, Y3
    }
}
