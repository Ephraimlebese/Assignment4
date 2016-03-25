package Assignment4.softwarePrinplesTest.isp;

import Assignment4.softwarePrinceples.isp.violation.Traveler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class ViolationISPTest
{
    @Test
    public void testISPViolation() throws Exception
    {
        Traveler traveler = new Traveler();

        Assert.assertEquals(traveler.taxi(),"Travelling by taxi");
        Assert.assertEquals(traveler.Jet(),"Travelling by jet");
        Assert.assertEquals(traveler.train(),"Travelling by train");
    }
}
