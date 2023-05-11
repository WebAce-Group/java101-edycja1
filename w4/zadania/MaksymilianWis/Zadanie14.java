public class Zadanie14
{
    public static void main(String args[])
    {

    }
    class Rectangle
    {
        private float lenght;
        private float width;

        Rectangle(float lenght, float width)
        {
            this.lenght = lenght;
            this.width = width;
        }

        float getArea()
        {
            return lenght * width;
        }

        float getPerimiter()
        {
            return 2*lenght + 2*width;
        }
    };

};