package main.java.hw4.shape.planeShape;

import main.java.hw4.interfaсe.AreaMeasurable;
import main.java.hw4.interfaсe.PerimeterMeasurable;
import main.java.hw4.vertex.Vertex2D;
import main.java.hw4.shape.Shape;



public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}

