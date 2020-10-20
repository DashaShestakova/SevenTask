package com.epam.idea.task.seven.observer;

import com.epam.idea.task.seven.model.Point;
import com.epam.idea.task.seven.model.Triangle;

import java.util.HashSet;
import java.util.Set;


public class TriangleObservable extends Triangle implements Observable {
    private Set<Observer> triangleObservers = new HashSet<>();

    public TriangleObservable(int id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(id, firstPoint, secondPoint, thirdPoint);
    }


    @Override
    public void addObserver(Observer triangle) {
        triangleObservers.add(triangle);
    }

    @Override
    public void removeObserver(Observer triangle) {
        triangleObservers.remove(triangle);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : triangleObservers) {
            observer.update(this);
        }
    }
}
