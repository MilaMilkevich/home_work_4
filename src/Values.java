import Shape.Shape;
import Shape.PlaneShape.Circle;
import Shape.PlaneShape.Rectangle;
import Shape.PlaneShape.Triangle;
import Shape.SpaceShape.Cuboid;
import Shape.SpaceShape.Sphere;
import Shape.SpaceShape.SquarePyramid;
import Vertex.Vertex2D;
import Vertex.Vertex3D;

public class Values {

    public static void start() {

        Vertex2D vertexTriangleFirst = new Vertex2D(5, 7);
        Vertex2D vertexTriangleSend = new Vertex2D(14, 9);
        Vertex2D vertexTriangleThird = new Vertex2D(12, 7);
        Triangle triangle = new Triangle(vertexTriangleFirst, vertexTriangleSend, vertexTriangleThird);

        Vertex2D vertexRectangle = new Vertex2D(300, 400);
        Rectangle rectangle = new Rectangle(vertexRectangle, 50, 100);

        Vertex2D vertexCircle = new Vertex2D(14, 8);
        Circle circle = new Circle(vertexCircle, 7);

        Vertex3D vertexSquarePyramid = new Vertex3D(10, 10, 10);
        SquarePyramid squarePyramid = new SquarePyramid(vertexSquarePyramid, 15, 15);

        Vertex3D vertexCuboid = new Vertex3D(20, 17, 14);
        Cuboid cuboid = new Cuboid(vertexCuboid, 18, 18, 20);

        Vertex3D vertexSphere = new Vertex3D(30, 30, 30);
        Sphere sphere = new Sphere(vertexSphere, 60);

        Shape[] shapes = {triangle, rectangle, circle, squarePyramid, cuboid, sphere};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

