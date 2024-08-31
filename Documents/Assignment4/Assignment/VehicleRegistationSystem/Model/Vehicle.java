package Model;

public class Vehicle {
    private Vehicle vehicle;
    private String brand;
    private String model;
    private static int vehicleCount;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(Vehicle vehicle){
        vehicle.setModel(this.model);
        vehicle.setBrand(this.brand);
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
     public void displayInfo(){

     }
}
