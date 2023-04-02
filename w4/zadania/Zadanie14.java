public class Zadanie14 {
    public static void main(String[] args) {
        class Rectangle {
            int length;
            int width;

            Rectangle(int newlength, int newwidth) {
                length = newlength;
                width = newwidth;
            }

            int getArea() {
                return length * width;
            }

            int getPerimeter() {
                return length * 2 + width * 2;
            }
        }
        Rectangle rect1 = new Rectangle(6, 4);

        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
    }
}
