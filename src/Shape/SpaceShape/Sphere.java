package Shape.SpaceShape;

import Shape.SpaceShape.SpaceShape;
import Vertex.Vertex3D;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertexA, double radius) {
        super(vertexA);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere: "
                + "Vertex ( " + getVertexA() +
                "), radius = " + getRadius() +
                ", area = " + calculateArea() +
                ", volume = " + calculateVolume() + ".";
    }
}
