package Model;

public class Truck extends Vehicle {
    private double payLoadCapacity;

    public Truck(String brand, String model, double pay) {
        super(brand, model);
        this.payLoadCapacity = pay;
    }

    public Truck(Vehicle vehicle, double pay) {
        super(vehicle);
        this.payLoadCapacity = pay;
    }

    @Override
    public void displayInfo() {
        System.out.println("******Truck********");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("PayLoadCapacity: " + this.payLoadCapacity + "\n");
    }
}
