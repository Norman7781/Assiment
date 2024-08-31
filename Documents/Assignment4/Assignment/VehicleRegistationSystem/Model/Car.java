package Model;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand, String model , int doors){
        super(brand,model);
        this.doors=doors;
    }

    public Car(Vehicle vehicle, int door) {
        super(vehicle);
        this.doors=door;
    }

    @Override
    public void displayInfo(){
        System.out.println("*******Car******");
        System.out.println("Brand: "+this.getBrand());
        System.out.println("Model: "+this.getModel());
        System.out.println("doors: "+this.doors+"\n");
    }
}
