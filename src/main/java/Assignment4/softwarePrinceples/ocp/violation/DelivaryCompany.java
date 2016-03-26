package Assignment4.softwarePrinceples.ocp.violation;

/**
 * Created by student on 2016/03/27.
 */
public class DelivaryCompany
{
    private String VehicleType;

    public String getVehicleType(int load)
    {
        if(load <100)
            VehicleType = "Van";
        else if(load >= 101)
            VehicleType = "Truck";

        return VehicleType;
    }
}
