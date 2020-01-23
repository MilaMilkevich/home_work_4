package main.java.hw4.shape.spaceShape;

import main.java.hw4.interfaсe.AreaMeasurable;
import main.java.hw4.interfaсe.VolumeMeasurable;
import main.java.hw4.shape.Shape;
import main.java.hw4.vertex.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);
    }

}
