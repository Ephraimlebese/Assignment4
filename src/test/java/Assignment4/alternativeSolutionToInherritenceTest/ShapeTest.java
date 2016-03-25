package Assignment4.alternativeSolutionToInherritenceTest;

import Assignment4.alternativeSolutionToInherritence.Square;
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
        //Composition is an alternative for inherritance
        Square square = new Square();

        Assert.assertEquals(square.getWidth(),40);
        Assert.assertEquals(square.getLength(),40);
        Assert.assertSame(square.getColor(),"Green");

    }
}
