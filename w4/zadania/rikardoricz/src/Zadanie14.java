public class Zadanie14 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 5);
        int rec1Area = rec1.getArea();
        int rec1Perimeter = rec1.getPerimeter();
        System.out.println("rectangle1 :\n" +
                "area = " + rec1Area + " " +
                "perimeter = " + rec1Perimeter);
    }
}