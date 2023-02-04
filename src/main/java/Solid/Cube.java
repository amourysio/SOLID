package Solid;

public class Cube  implements IShape, iThreeDimensionalShape{
    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
