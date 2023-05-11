package org.example;

public class Rectangle
{
    private float lenght;
    private float width;
    public Rectangle(float lenght, float width)
    {
        this.lenght = lenght;
        this.width = width;
    }

    public float getArea() {
        float area = lenght*width;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2*lenght+2*width;
        return perimeter;
    }
}
