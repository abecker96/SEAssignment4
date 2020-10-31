import Expression.*;

public class Constant implements Expression
{
    private double value;

    public Constant(double v)
    {
        value = v;
    }

    public double calculate()
    {
        return value;
    }

    public boolean isTree()
    {
        return false;
    }
}
