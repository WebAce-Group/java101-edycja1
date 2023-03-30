package w4.zadania.Maksymilian74;
public class Rectangle {
        int length;
        int width;

        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getArea() {
                return length * width;
        }

        public int getPerimeter() {
                return 2 * (length + width);
        }
}

class zad14 {
        public static void main(String[] args) {
                Rectangle rect1 = new Rectangle(10, 20);

                System.out.println("Pole: " + rect1.getArea());
                System.out.println("Obwód: " + rect1.getPerimeter());
        }
}

