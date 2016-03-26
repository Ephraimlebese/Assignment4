package Assignment4.softwarePrinplesTest.ocp;

import Assignment4.softwarePrinceples.ocp.violation.DelivaryCompany;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/27.
 */
public class OCPViolation
{
    @Test
    public void testOCPViolation() throws Exception
    {
        DelivaryCompany delivaryCompany = new DelivaryCompany();

        Assert.assertEquals(delivaryCompany.getVehicleType(50),"Van");

    }
}
