package Assignment4.softwarePrinplesTest.plk;

import Assignment4.softwarePrinceples.plk.violation.Person;
import Assignment4.softwarePrinceples.plk.violation.Wallet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/27.
 */
public class PLKViolation
{
    @Test
    public void testPLKViolation() throws Exception
    {
        Person person = new Person();

        Wallet payment =  person.getWallet();


        Assert.assertNull(payment);

    }
}
