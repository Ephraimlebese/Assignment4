package Assignment4.objectOrientedProgrammingTest.inherritenceTest;

import Assignment4.objectOrientedProgramming.inherritance.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class ShapeTest
{
    @Test
    public void testShape() throws Exception
    {
        Square square = new Square(20,20,"Blue");

        Assert.assertSame(square.getColor(),"Blue");
        Assert.assertSame(square.getLength(),20);
        Assert.assertSame(square.getWidth(),20);
    }
}
