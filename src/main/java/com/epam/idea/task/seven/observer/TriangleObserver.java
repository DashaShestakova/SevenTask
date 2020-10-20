package com.epam.idea.task.seven.observer;

import com.epam.idea.task.seven.exception.DataException;
import com.epam.idea.task.seven.logic.TriangleCalculator;
import com.epam.idea.task.seven.repository.Repository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class TriangleObserver implements Observer{
    private TriangleCalculator calculator;


    private TriangleObserver() {
    }

    private Map<Integer, Parameters> map = new HashMap<>();


    public void addTriangle(TriangleObservable triangle, Parameters triangleData) {
        triangle.addObserver(this);
        map.put(triangle.getId(), triangleData);

    }

    public int getSize() {
        return map.size();
    }

    public void addTriangleParameters(int triangleId, Parameters parametersHolder){
        map.put(triangleId, parametersHolder);
    }

    public void deleteTriangleParameters(int triangleId){
        map.remove(triangleId);
    }

    public double getTriangleArea(int triangleId) throws DataException {
        if (map.containsKey(triangleId)) {
            Parameters parametersHolder = map.get(triangleId);
            return parametersHolder.getArea();
        } else {
            throw new DataException("Triangle not found");
        }
    }

    public double getTrianglePerimeter(int triangleId) throws DataException {
        if (map.containsKey(triangleId)) {
            Parameters parametersHolder = map.get(triangleId);
            return parametersHolder.getPerimeter();
        } else {
            throw new DataException("Triangle not found");
        }
    }

    @Override
    public void update(TriangleObservable triangle) {
        double area = calculator.calculateArea(triangle);
        double perimeter = calculator.calculatePerimeter(triangle);
        map.put(triangle.getId(), new Parameters(area, perimeter));
    }
}
