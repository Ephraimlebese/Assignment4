package Assignment4.objectOrientedProgrammingTest.polymorphism;

import Assignment4.objectOrientedProgramming.polymorphism.Animal;
import Assignment4.objectOrientedProgramming.polymorphism.Bird;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class AnimalTest
{
    @Test
    public void testAnimal() throws Exception
    {
        Animal bird = new Bird();

        Assert.assertSame(bird.move(),"Flying");

    }
}
