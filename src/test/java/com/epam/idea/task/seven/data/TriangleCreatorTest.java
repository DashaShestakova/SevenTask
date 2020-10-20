package com.epam.idea.task.seven.data;

import com.epam.idea.task.seven.exception.DataException;
import com.epam.idea.task.seven.exception.InputFileException;
import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TriangleCreatorTest {

    TriangleCreator creator = new TriangleCreator();

    @Test(expected = DataException.class)
    public void createTrianglePointsAreNotTriangle() throws DataException {
        List<String> list = new ArrayList<>();
        list.add("-1, -2, 1, 2, -1, -2");
        creator.generateTriangles(list);
    }

    @Test
    public void createTrianglePositive() throws DataException {
        int ID = 1;
        List<String> list = new ArrayList<>();
        list.add("-1, -2, 1, 2, 3, 4");
        Point point1 = new Point(-1, -2);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(3, 4);
        Triangle expectedTriangle = new Triangle(ID, point1, point2, point3);
        List<Triangle> triangles = creator.generateTriangles(list);
        assertEquals(expectedTriangle, triangles.get(0));
    }
}
