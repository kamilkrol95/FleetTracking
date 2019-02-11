package FleetTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Setup {

    private List<Vehicle> vehiclesInFleet = new ArrayList<>();

    public void showVehicles(List<Vehicle> vehiclesFleet){
        for (Vehicle vehicle : vehiclesFleet) {
            System.out.println(vehicle.toString());
        }
    }

    protected void addVehicleToFleet(Vehicle newVehicle){
        this.vehiclesInFleet.add(newVehicle);
    }

    protected void removeVehicleFromFleet(Vehicle rmVehicle) throws Exception {
        if(!vehiclesInFleet.contains(rmVehicle)){
            throw new Exception("Vehicle not in base!");
        } else {
            this.vehiclesInFleet.remove(rmVehicle);
        }
    }

    public List<Vehicle> loadBasicSetup(){
        vehiclesInFleet.add(new Vehicle("V-MS-001","Mercedes-Benz", "S63AMG", 70, 15));
        vehiclesInFleet.add(new Vehicle("V-A6-001","Audi", "RS6", 85, 1250));
        vehiclesInFleet.add(new Vehicle("V-A4-001","Audi", "S4", 60, 22560));
        vehiclesInFleet.add(new Vehicle("V-B5-001","BMW", "M5", 65, 8900));
        vehiclesInFleet.add(new Vehicle("V-B6-001","BMW", "x6M", 70, 23100));
        vehiclesInFleet.add(new Vehicle("V-ME-001","Mercedes-Benz", "E63ANG", 80, 12140));
        vehiclesInFleet.add(new Vehicle("V-FP-001","Ferrari", "488 Pista", 90, 260));

        return vehiclesInFleet;
    }


}
