package Service;

import Model.Car;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

public class carRegistartionService extends VehicleRegisterService{
    private int door;
//    public static void carDisplay() throws IOException {
//        System.out.print("Enter doors: ");
//        int door = Integer.parseInt(br.readLine());
//        vehicles[Vehicle.getVehicleCount()] = new Car(getVehicles(),door);
//    }
    @Override
    public void registerProcess()throws IOException{
        System.out.print("Enter doors: ");
        door = Integer.parseInt(br.readLine());
        VehicleRegisterService.vehicles[Vehicle.getVehicleCount() - 1] = new Car(this.getVehicle(),this.door);
    }
}
