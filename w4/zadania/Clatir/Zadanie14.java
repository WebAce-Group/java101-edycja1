public class Zadanie14 {

    public static class Rectangle {
        private int length;
        private int width;

        public Rectangle(int length, int width)
        {
            this.length = length;
            this.width = width;
        }

        public int getArea()
        {
            return length * width;
        }

        public int getParemeter()
        {
            return 2 * (length + width);
        }

    }




}
