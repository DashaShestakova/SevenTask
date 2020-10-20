package com.epam.idea.task.seven.repository.specification;

import com.epam.idea.task.seven.model.Triangle;

public class TriangleByIDSpecification implements Specification{
    private final int id;

    public TriangleByIDSpecification(Integer id) {
        this.id = id;
    }

    @Override
    public boolean isSpecified(Triangle triangle) {
        return triangle.getId() == id;
    }
}
