package Model;

public class Rent {
    private Customer customer;
    private Vehicle vehicle;
    private int rentDay;
    private double totalPrice;
    private static int rentCount;
    private int rentId;

    public Rent(Customer customer, Vehicle vehicle,int rentDay){
        this.customer = customer;
        this.vehicle=vehicle;
        this.rentDay=rentDay;
    }
    public  void Total(){
        this.totalPrice = vehicle.getRentalPrice() * this.rentDay;
    }
    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public int getRentDays() {
        return rentDay;
    }

    public static int getRentCount() {
        return rentCount;
    }

    public int getRentalId() {
        return rentId;
    }
}
