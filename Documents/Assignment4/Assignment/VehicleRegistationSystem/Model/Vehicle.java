package Model;

abstract public class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }
    public static int getVehicleCount(){
        return vehicleCount;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    abstract public void displayInfo();
}
