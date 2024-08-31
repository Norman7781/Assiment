package Service;

import Model.Car;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

import static Service.VehicleRegisterService.*;

public class truckRegistarionService extends VehicleRegisterService {
    private double pay;
    @Override
    public void registerProcess()throws IOException{
        System.out.print("Enter payLoadCapacity: ");
        pay = Double.parseDouble(br.readLine());
        VehicleRegisterService.vehicles[Vehicle.getVehicleCount() - 1] = new Truck(this.getVehicle(),this.pay);
    }
}
