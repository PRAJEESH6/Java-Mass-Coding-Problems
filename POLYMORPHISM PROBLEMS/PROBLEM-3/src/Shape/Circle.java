package Shape;

public class Circle extends Shapes {

    private double radious;

    public Circle(double radious)
    {
        this.radious = radious;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * radious * radious;
    }
}
