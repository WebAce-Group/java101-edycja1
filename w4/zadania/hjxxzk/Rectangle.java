package w4.zadania.hjxxzk;

public class Rectangle {
    float length;
    float width;

    public Rectangle(float length, float width) {

       this.length = length;
       this.width = width;

    }

        public float getArea () {

            return length * width;

        }

        public float getPerimeter () {

            return (2 * length) + (2 * width);

        }



}
