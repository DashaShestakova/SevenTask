package com.epam.idea.task.seven.repository;

import com.epam.idea.task.seven.model.Triangle;
import com.epam.idea.task.seven.repository.specification.Specification;

import java.util.Comparator;
import java.util.List;

public interface Repository {
    void add(Triangle triangle);
    void delete(Triangle triangle);
    void update(Triangle triangle);
    List<Triangle> sort(Comparator<Triangle> comparator);
    List<Triangle> query(Specification specification);
}
