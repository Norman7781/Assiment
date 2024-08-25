package Service;

import Model.Vehicle;
import Model.Car;
import Model.Motorcycle;
import Model.Truck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    static Vehicle[] vehicles = new Vehicle[100];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String brand;
    private static String model;
    private static String type;
    private static String flag="";

    public static void main(String[] args) throws IOException {
        do{
            getInfo();
            if(type.equalsIgnoreCase("car")){
                carDisplay();
            }
            if(type.equalsIgnoreCase("truck")){
                truckDisplay();
            }
            if(type.equalsIgnoreCase("motorcycle")){
                motorcycleDisplay();
            }
            System.out.print("Do yo want to add new vehicle: ");
            flag= br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
        display();
    }

    public static void display(){
        for (int i = 0; i <Vehicle.getVehicleCount(); i++) {
            vehicles[i].displayInfo();
        }
    }

    public static void getInfo() throws IOException {
        System.out.print("Enter Vehicle Brand: ");
        brand = br.readLine();
        System.out.print("Enter Vehicle Model: ");
        model = br.readLine();
        System.out.print("Enter type of Vehicle:(Car,Truck,Motorcycle) ");
        type = br.readLine();
    }
    public static void carDisplay() throws IOException {
        System.out.print("Enter doors: ");
        int door = Integer.parseInt(br.readLine());
        vehicles[Vehicle.getVehicleCount()] = new Car(brand,model,door);
    }
    public static void truckDisplay() throws IOException {
        System.out.print("Enter payLoadCapacity: ");
        double pay = Double.parseDouble(br.readLine());
        vehicles[Vehicle.getVehicleCount()] = new Truck(brand,model,pay);
    }
    public static void motorcycleDisplay() throws IOException {
        System.out.print("Has a side car:(true,false) ");
        boolean has = Boolean.parseBoolean(br.readLine());
        vehicles[Vehicle.getVehicleCount()] = new Motorcycle(brand,model,has);
    }
}
