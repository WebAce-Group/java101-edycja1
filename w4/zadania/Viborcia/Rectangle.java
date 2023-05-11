package w4.zadania.Viborcia;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double getArea(){
        return length*width;
    }

    double getPerimeter(){
        return 2*length+2*width;
    }
}
