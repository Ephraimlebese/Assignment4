package Assignment4.alternativeSolutionToInherritence;

/**
 * Created by student on 2016/03/25.
 */
public class Square
{
    private Shape shape;

    public Square()
    {
        this.shape = new Shape();
        shape.setLength(40);
        shape.setWidth(40);
        shape.setColor("Green");
    }

    public int getLength() {
        return shape.getLength();
    }

    public int getWidth() {
        return shape.getWidth();
    }

    public String getColor() {
        return shape.getColor();
    }
}
