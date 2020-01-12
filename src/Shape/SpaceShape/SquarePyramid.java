package Shape.SpaceShape;

import Vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {

    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertexA, double width, double height) {
        super(vertexA);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 2 * width * (width / (2 + Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2))));
    }

    @Override
    public double calculateVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid: " +
                " Vertex (" + getVertexA() +
                ") width = " + getWidth() +
                ", height = " + getHeight() +
                ", area = " + calculateArea() +
                ", volume = " + calculateVolume() +
                '.';
    }
}

