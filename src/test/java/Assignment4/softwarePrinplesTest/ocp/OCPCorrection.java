package Assignment4.softwarePrinplesTest.ocp;

import Assignment4.softwarePrinceples.ocp.correction.Van;
import Assignment4.softwarePrinceples.ocp.correction.Vehicle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/27.
 */
public class OCPCorrection
{
    @Test
    public void testOCPCorrection() throws Exception
    {
        Vehicle vehicle = new Van();

        Assert.assertEquals(vehicle.getType(),"Van");


    }
}
