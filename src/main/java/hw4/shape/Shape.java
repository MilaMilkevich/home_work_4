package main.java.hw4.shape;

import main.java.hw4.vertex.Vertex;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexA() {
        return vertexA;
    }
}
