package Assignment4.softwarePrinplesTest.dip;

import Assignment4.softwarePrinceples.dip.violation.Lecturer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class ViolationDIPTest
{
    @Test
    public void testDIPViolation() throws Exception
    {
        Lecturer clerk = new Lecturer();

        Assert.assertSame(clerk.getJobDescribtion(),"Answer calls");
    }
}
