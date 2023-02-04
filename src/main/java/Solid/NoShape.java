package Solid;

public class NoShape implements IShape {
    @Override
    public double area() {
        throw new IllegalStateException(
                "Cannot calculate area!");
    }
}
