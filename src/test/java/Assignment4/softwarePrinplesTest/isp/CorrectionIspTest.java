package Assignment4.softwarePrinplesTest.isp;
import Assignment4.softwarePrinceples.isp.correction.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class CorrectionIspTest
{
    @Test
    public void testISPCorrection() throws Exception
    {
        Person perform = new Person();

        Assert.assertSame(perform.eat(),"Eating");
        Assert.assertSame(perform.talk(),"Talking");
        Assert.assertSame(perform.walk(),"Walking");
    }
}
