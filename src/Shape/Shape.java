package Shape;

import Vertex.Vertex;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexA() {
        return vertexA;
    }
}
