package com.epam.idea.task.seven.repository;

import com.epam.idea.task.seven.model.Triangle;
import com.epam.idea.task.seven.repository.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TriangleRepository implements Repository {
    private static Logger logger = LogManager.getLogger();

    private List<Triangle> triangles = new ArrayList<>();

    private TriangleRepository() {
    }


    @Override
    public void add(Triangle triangle) {
        triangles.add(triangle);
    }

    @Override
    public void delete(Triangle triangle) {
        int num = triangle.getId();
        triangles.remove(num);
        logger.info("Triangle " + triangle + "is deleted");
    }

    @Override
    public void update(Triangle triangle) {
        int id = triangle.getId();
        triangles.set(id, triangle);
        logger.info("Triangle " + triangle + "is updated");
    }

    @Override
    public List<Triangle> sort(Comparator<Triangle> comparator) {
        triangles.sort(comparator);
        logger.info("Triangles are sorted");
        return triangles;
    }

    @Override
    public List<Triangle> query(Specification specification) {
        List<Triangle> result = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (specification.isSpecified(triangle)) {
                result.add(triangle);
            }
        }
        logger.info("Triangles are specified");
        return result;
    }
}
