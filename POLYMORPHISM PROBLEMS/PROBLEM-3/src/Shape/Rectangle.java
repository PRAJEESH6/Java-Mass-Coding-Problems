package Shape;

public class Rectangle extends Shapes{

    private double Height;
    private double Width;

    public Rectangle(double Height, double Width)
    {
        this.Height = Height;
        this.Width = Width;
    }

    @Override
    public double CalculateArea() {

        return Height * Width;
    }
}
