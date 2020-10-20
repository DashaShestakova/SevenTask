package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.exception.DataException;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;
import com.epam.idea.task.seven.validator.TriangleValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TriangleCreator {
    public static final int X1 = 0;
    public static final int Y1 = 1;
    public static final int X2 = 2;
    public static final int Y2 = 3;
    public static final int X3 = 4;
    public static final int Y3 = 5;
    private static Logger logger = LogManager.getLogger();
    private static final String SEPARATOR = "\\s";
    private TriangleDataCheck dataCheck = new TriangleDataCheck();
    private TriangleValidator validator = new TriangleValidator();

    public List<Triangle> generateTriangles(List<String> inputLines) throws DataException {
        logger.info("Start of generating Triangles");
        List<Triangle> triangles = new ArrayList<>();
        int triangleId = 0;
        for (int i = 0; i < inputLines.size(); i++) {
            String line = inputLines.get(i);
            if (!dataCheck.checkInput(line)) {
                throw new DataException("Wrong input line " + i);
            } else {
                String[] coordinates = line.split(SEPARATOR);
                Point pointA = new Point(Double.parseDouble(coordinates[X1]), Double.parseDouble(coordinates[Y1]));
                Point pointB = new Point(Double.parseDouble(coordinates[X2]), Double.parseDouble(coordinates[Y2]));
                Point pointC = new Point(Double.parseDouble(coordinates[X3]), Double.parseDouble(coordinates[Y3]));
                if (validator.isPointsTriangle(pointA, pointB, pointC)) {
                    triangles.add(new Triangle(triangleId, pointA, pointB, pointC));
                    triangleId++;
                } else {
                    throw new DataException("Points are not creating a triangle");
                }
            }
        }
        logger.info("Triangles are generated");
        return triangles;
    }
}

