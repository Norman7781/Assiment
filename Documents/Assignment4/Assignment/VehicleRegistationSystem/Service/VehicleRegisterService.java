package Service;

import Model.Vehicle;
import Model.Car;
import Model.Motorcycle;
import Model.Truck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    public static Vehicle[] vehicles = new Vehicle[100];
    public  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Vehicle vehicle;


    public void create()throws IOException{
        commonInfo();
        registerProcess();
    }
    public void registerProcess()throws IOException{

    }
    public  void display(){
        for (int i = 0; i <Vehicle.getVehicleCount(); i++) {
            vehicles[i].displayInfo();
        }
    }


    public  void commonInfo() throws IOException {
        System.out.print("Enter Vehicle Brand: ");
        String brand = br.readLine();
        System.out.print("Enter Vehicle Model: ");
        String model = br.readLine();
        this.vehicle= new Vehicle(brand,model);
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

}
