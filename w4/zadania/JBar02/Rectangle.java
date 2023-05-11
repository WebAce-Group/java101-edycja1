package w4.zadania.JBar02;

import java.util.Scanner;

public class Rectangle {
        int length;//atrybut
        int width;//atrybut
    Scanner scanner=new Scanner(System.in);

    //konstruktor
    Rectangle(int l, int w){
        length= l;
        width=w;
    }

    // Metody klasy Car
    public int getArea() {
        return length*width;
    }

    public int getPerimeter() {
        return 2*width+2*length;
    }



    public static void main(String[] args) {
        Rectangle rect1= new Rectangle(4,4);
        System.out.println("Pole "+ rect1.getArea());
        System.out.println("obwod " + rect1.getPerimeter());

    }
}