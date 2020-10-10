package com.epam.idea.task.seven.model;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    @Override
    public int hashCode() {
        int result = 17;
        int factor = 31;
        result = factor *  result + (int)pointX;
        result = factor *  result + (int)pointY;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)
            return true;
        if (obj==null||obj.getClass()!=this.getClass())
            return false;
        Point dot=(Point)obj;
        return this.getPointX()==dot.getPointX() && this.getPointY()==dot.getPointY();
    }

    @Override
    public String toString() {
        return "Point" + " x = " + pointX + " y = " + pointY;
    }
}
