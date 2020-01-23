package main.java.hw4.shape.spaceShape;

import main.java.hw4.vertex.Vertex3D;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertexA, double width, double height, double depth) {
        super(vertexA);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public double calculateArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " + "Vertex (" + getVertexA() +
                "), width=" + getWidth() +
                ", height=" + getHeight() +
                ", depth=" + getDepth() +
                ", area = " + calculateArea() +
                ", volume = " + calculateVolume() +
                '.';
    }
}
