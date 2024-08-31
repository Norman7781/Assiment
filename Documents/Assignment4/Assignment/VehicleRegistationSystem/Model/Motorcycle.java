package Model;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model,boolean has){
        super(brand,model);
        this.hasSideCar=has;
    }

    public Motorcycle(Vehicle vehicle, boolean has) {
        super(vehicle);
        this.hasSideCar=has;
    }

    @Override
    public void displayInfo(){
        System.out.println("*******Bike********");
        System.out.println("Brand: "+this.getBrand());
        System.out.println("Model: "+this.getModel());
        System.out.println("HasSideCar: "+this.hasSideCar+"\n");
    }
}
