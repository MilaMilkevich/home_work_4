package Shape.PlaneShape;

import Interfase.AreaMeasurable;
import Interfase.PerimeterMeasurable;
import Vertex.Vertex2D;
import Shape.Shape;



public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}

