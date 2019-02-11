package FleetTracking;


import java.io.IOException;

public class Vehicle {
    private static int INTERNAL_NO_LENGTH = 8;
    private String internalNumber;
    private String brand;
    private String model;
    private float fuel;
    private float fuelTankCapacity;
    private int mileage;

    public Vehicle (String internalNumber){
        this(internalNumber,"N/A", "N/A",0,0);
    }

    public Vehicle (String internalNumber, String brand, String model, float fuelTankCapacity){
        this.internalNumber = internalNumber;
        this.brand = brand;
        this.model = model;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuel = fuelTankCapacity;
        this.mileage = 0;
    }

    public Vehicle (String internalNumber, String brand, String model, float fuelTankCapacity, int mileage){
        this(internalNumber, brand, model, fuelTankCapacity);
        this.mileage = mileage;
    }
    public boolean equals(Vehicle that){
        if(this.internalNumber == that.internalNumber){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        String vehicleState = String.format("No. %8s",this.internalNumber)
                + String.format(": %20s", this.brand + " " + this.model)
                + String.format(" [%.1fl]",this.fuel)
                + String.format(" [%dkm]",this.mileage);
        return vehicleState;
        //"No. " + this.internalNumber + ": " + this.brand + " " + this.model + "\t\t\t\t[" + this.fuel + "l]\t[" + this.mileage + "km]";
    }

    public String getInternalNumber() {
        return internalNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getFuel() {
        return fuel;
    }

    public float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setInternalNumber(String internalNumber) throws IOException{
        if(internalNumber.length() < INTERNAL_NO_LENGTH){
            throw new IOException("Internal number too short!");
        } else {
            this.internalNumber = internalNumber;
        }
    }
}
