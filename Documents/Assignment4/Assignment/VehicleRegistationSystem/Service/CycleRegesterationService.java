package Service;

import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

public class CycleRegesterationService extends VehicleRegisterService{
    private boolean has;
    @Override
    public void registerProcess()throws IOException {
        System.out.print("Has a side car:(true,false) ");
        has = Boolean.parseBoolean(br.readLine());
        VehicleRegisterService.vehicles[Vehicle.getVehicleCount() - 1] = new Motorcycle(this.getVehicle(),this.has);
    }

}
