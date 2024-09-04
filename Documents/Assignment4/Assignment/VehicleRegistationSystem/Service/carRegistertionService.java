package Service;

import Dao.VehicleDB;
import Model.Car;
import Model.Vehicle;

import java.io.IOException;

public class carRegistertionService extends VehicleRegisterService {
    private int door;
    //    public static void carDisplay() throws IOException {
//        System.out.print("Enter doors: ");
//        int door = Integer.parseInt(br.readLine());
//        vehicles[Vehicle.getVehicleCount()] = new Car(getVehicles(),door);
//    }
    private VehicleDB vehicleDB;

    public carRegistertionService() {
        this.vehicleDB = new VehicleDB();
    }

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter doors: ");
        door = Integer.parseInt(br.readLine());
        Vehicle car = new Car(this.getVehicle(), this.door);
        vehicleDB.create(car);
    }
}
