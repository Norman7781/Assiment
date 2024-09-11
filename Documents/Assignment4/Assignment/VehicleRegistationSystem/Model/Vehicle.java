package Model;

public class Vehicle {
    public static final int Max_Vehicle_count = 1000;
    private Vehicle vehicle;
    private String brand;
    private String model;
    private double rentalPrice;
    private static int vehicleCount;
    private static int id;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        vehicleCount++;
        this.id = vehicleCount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(Vehicle vehicle) {
        vehicle.setModel(this.model);
        vehicle.setBrand(this.brand);
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Vehicle.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void displayInfo() {

    }

    public double getRentalPrice() {
        return rentalPrice;
    }
}
