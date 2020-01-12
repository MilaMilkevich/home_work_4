package Shape.SpaceShape;

import Interfase.AreaMeasurable;
import Interfase.VolumeMeasurable;
import Shape.Shape;
import Vertex.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);
    }

}
