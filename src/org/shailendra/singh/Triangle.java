package org.shailendra.singh;

/**
 * Created by shailendra.singh on 7/13/16.
 */
public class Triangle {

    private Point pointA,pointB,pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Point A: " + getPointA().getX() + ", " + getPointA().getY());
        System.out.println("Point B: " + getPointB().getX() + ", " + getPointB().getY());
        System.out.println("Point C: " + getPointC().getX() + ", " + getPointC().getY());
    }

}
