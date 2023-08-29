package Lesson4.Easy;

public class Rectangle<length> {
     int width;
     int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int parimeter (){
        return 2*(width+length);
    }
    public int square() {
        return width*length;
    }

}
