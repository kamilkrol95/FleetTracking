package FleetTracking;

import sun.reflect.annotation.ExceptionProxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Setup setup = new Setup();
        List<Vehicle> vehiclesInFleet = setup.loadBasicSetup();

        setup.showVehicles(vehiclesInFleet);
        setup.addVehicleToFleet(new Vehicle("V-MC-002"));
        System.out.println();
        setup.showVehicles(vehiclesInFleet);

        Vehicle vehToRemove = new Vehicle("V-MC-002");
        for(Vehicle vehicle : vehiclesInFleet){
            if(vehicle.equals(vehToRemove)){
                vehToRemove = vehicle;
            }
        }
        try {
            setup.removeVehicleFromFleet(vehToRemove);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
        setup.showVehicles(vehiclesInFleet);

    }

}
