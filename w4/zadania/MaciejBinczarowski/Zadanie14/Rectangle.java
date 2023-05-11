public class Rectangle
{
    private final double length;
    private final double width;

    public Rectangle(final double length, final double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return 2 * length + 2 * width;
    }
}