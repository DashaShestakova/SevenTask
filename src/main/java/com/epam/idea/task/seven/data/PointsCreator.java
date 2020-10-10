package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.exception.DataException;

public class PointsCreator {
    private final String SEPARATOR = "\\s";
    private TriangleDataCheck triangleValidator = new TriangleDataCheck();



    public double[] createPoints(String triangleInput) throws DataException {
        if (!triangleValidator.checkInput(triangleInput)) {
            throw new DataException("Input text is not valid.");
        }
        String[] pointsStringArray = triangleInput.split(SEPARATOR);
        double[] pointsArray = new double[pointsStringArray.length];
        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i] = Double.parseDouble(pointsStringArray[i]);
        }

        return pointsArray;

    }
}
