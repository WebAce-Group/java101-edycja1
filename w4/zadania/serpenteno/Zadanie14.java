import java.util.*;

public class Rectangle
{
	private double length_;
	private double width_;
	
	Rectangle(double length, double width)
	{
		length_ = length;
		width_ = width;
	}
	
	double getArea()
	{
		return length_ * width_;
	}
	
	double getPerimiter()
	{
		return 2*length_ + 2*width_;
	}
    public static void main(String args[])
	{
		Rectangle rectangle = new Rectangle(2.5,5.1);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimiter());
    }
}
