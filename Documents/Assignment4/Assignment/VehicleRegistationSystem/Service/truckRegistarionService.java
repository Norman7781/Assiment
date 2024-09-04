package Service;

import Dao.VehicleDB;
import Model.Car;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

import static Service.VehicleRegisterService.*;

public class truckRegistarionService extends VehicleRegisterService {
    private double pay;
    private VehicleDB vehicleDB;

    public truckRegistarionService() {
        this.vehicleDB = new VehicleDB();
    }

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter payLoadCapacity: ");
        pay = Double.parseDouble(br.readLine());
        Vehicle truck = new Truck(this.getVehicle(), this.pay);
        this.vehicleDB.create(truck);
    }
}
