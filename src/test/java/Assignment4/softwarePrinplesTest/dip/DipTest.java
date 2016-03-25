package Assignment4.softwarePrinplesTest.dip;

import Assignment4.softwarePrinceples.dip.correction.Clerk;
import Assignment4.softwarePrinceples.dip.correction.Lecturer;
import Assignment4.softwarePrinceples.dip.correction.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/25.
 */
public class DipTest
{
    @Test
    public void testDIPCorrection() throws Exception
    {
        Person clerk = new Clerk();
        Person lecture = new Lecturer();

        Assert.assertEquals(clerk.getJobDescribtion(),"Answer calls");
        Assert.assertEquals(lecture.getJobDescribtion(),"Lecture students");
    }
}
