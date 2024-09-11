package Service;

import Dao.VehicleDB;
import Model.Vehicle;
import Model.Car;
import Model.Motorcycle;
import Model.Truck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class VehicleRegisterService {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Vehicle vehicle;
    private VehicleDB vehicleDB;

    public VehicleRegisterService() {
        this.vehicleDB = new VehicleDB();
    }

    public void create() throws IOException {
        commonInfo();
        registerProcess();
    }

    public abstract void registerProcess() throws IOException;

    public void display() {
        //vehicleDB.getAll();
        Vehicle[] allVehicles = vehicleDB.getAll();
        for (Vehicle vehicle : allVehicles) {
            if (vehicle != null) {
                vehicle.displayInfo();
            }
        }
    }


    public void commonInfo() throws IOException {
        System.out.print("Enter Vehicle Brand: ");
        String brand = br.readLine();
        System.out.print("Enter Vehicle Model: ");
        String model = br.readLine();
        this.vehicle = new Vehicle(brand, model);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
