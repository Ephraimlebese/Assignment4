package Assignment4.softwarePrinceples.isp.correction;

/**
 * Created by student on 2016/03/25.
 */
public class Person implements Eat,Talk,Walk
{

    @Override
    public String eat() {
        return "Eating";
    }

    @Override
    public String talk() {
        return "Talking";
    }

    @Override
    public String walk() {
        return "Walking";
    }
}
