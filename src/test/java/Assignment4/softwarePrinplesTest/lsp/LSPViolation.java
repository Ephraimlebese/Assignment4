package Assignment4.softwarePrinplesTest.lsp;

import Assignment4.softwarePrinceples.lsp.violation.Truck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/26.
 */
public class LSPViolation
{
    @Test
    public void testLSPViolation() throws Exception
    {
        Truck truck = new Truck();

        Assert.assertEquals(truck.move("25"),"Moving at:25");

    }
}
