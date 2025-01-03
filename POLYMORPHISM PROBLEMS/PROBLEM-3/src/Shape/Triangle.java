package Shape;

public class Triangle  extends Shapes{

    private double Base;
    private double Height;

    public Triangle(double Base,double Height)
    {
        this.Base = Base;
        this.Height = Height;
    }

    @Override
    public double CalculateArea() {

        //System.out.println(0.5 * Base * Height);
        return 0.5 * Base * Height;
    }
}
