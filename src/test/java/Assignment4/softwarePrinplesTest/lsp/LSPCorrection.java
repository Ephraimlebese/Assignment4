package Assignment4.softwarePrinplesTest.lsp;

import Assignment4.softwarePrinceples.lsp.correction.Van;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/26.
 */
public class LSPCorrection
{
    @Test
    public void testLSPCorrection() throws Exception
    {
        Van van = new Van();

        Assert.assertEquals(van.move("25"), "Moving at:25");

    }
}
