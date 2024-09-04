package Service;

import Dao.VehicleDB;
import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

public class CycleRegesterationService extends VehicleRegisterService {
    private boolean has;
    private VehicleDB vehicleDB;

    public CycleRegesterationService() {
        this.vehicleDB = new VehicleDB();
    }

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Has a side car:(true,false) ");
        has = Boolean.parseBoolean(br.readLine());
        Vehicle moto = new Motorcycle(this.getVehicle(), this.has);
        vehicleDB.create(moto);
    }

}
