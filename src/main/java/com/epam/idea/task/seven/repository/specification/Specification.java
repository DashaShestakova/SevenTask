package com.epam.idea.task.seven.repository.specification;

import com.epam.idea.task.seven.model.Triangle;

public interface Specification {
    boolean isSpecified(Triangle triangle);
}
