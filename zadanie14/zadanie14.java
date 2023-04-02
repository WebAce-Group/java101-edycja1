public class zadanie14
{
    private double length;
    private double width;

    public zadanie14(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea(double length, double width)
    {
        return width*length;
    }

    public double getPerimeter(double length, double width)
    {
        return 2*length + 2*width;
    }
}