package main.java.hw4.vertex;

public class Vertex3D extends Vertex {

    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }


    @Override
    public String toString() {
        return super.toString() + ", z = " + getZ();
    }
}
