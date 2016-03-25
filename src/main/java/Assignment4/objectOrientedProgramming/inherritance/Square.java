package Assignment4.objectOrientedProgramming.inherritance;

/**
 * Created by student on 2016/03/25.
 */
public class Square extends Shape {
    private String color;

    public Square(int length, int width, String color) {
        super(length, width);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
