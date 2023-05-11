package wyklad4;

public class Rectangle {
    private float width;
    private float length;
    public Rectangle(float length, float width){
        this.width = width;
        this.length = length;
    }
    public float getArea(){
        return width*length;
    }
    public float getPerimeter(){
        return 2*width+2*length;
    }
}
