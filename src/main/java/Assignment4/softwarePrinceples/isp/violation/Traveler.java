package Assignment4.softwarePrinceples.isp.violation;

/**
 * Created by student on 2016/03/25.
 */
public class Traveler implements TravelMethods
{
    @Override
    public String taxi() {
        return "Travelling by taxi";
    }

    @Override
    public String train()
    {
        return "Travelling by train";
    }

    @Override
    public String Jet()
    {
        return "Travelling by jet";
    }
}
