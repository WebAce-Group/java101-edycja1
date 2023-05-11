public class Rectangle {
    int width;
    int height;

    Rectangle(int _width, int _height){
        width = _width;
        height = _height;
    }

    public int getArea(){
        return  width * height;
    }

    public int getPerimeter(){
        return (width + height) * 2;
    }
}
