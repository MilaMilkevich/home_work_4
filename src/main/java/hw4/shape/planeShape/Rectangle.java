package main.java.hw4.shape.planeShape;

import main.java.hw4.vertex.Vertex2D;

public class Rectangle extends PlaneShape {

    private double width;
    private double high;

    public Rectangle(Vertex2D vertexA, double width, double high) {
        super(vertexA);
        this.width = width;
        this.high = high;
    }

    private double getWidth() {
        return width;
    }

    private double getHigh() {
        return high;
    }

    @Override
    public double calculateArea() {
        return this.width * this.high;
    }

    @Override
    public double calculatePerimeter() {
        return (this.width + this.high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Vertex (" + getVertexA() +
                "), width = " + getWidth() +
                ", high = " + getHigh() +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '.';
    }
}
