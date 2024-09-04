package MainVehicle;

import Service.CycleRegesterationService;
import Service.VehicleRegisterService;
import Service.carRegistertionService;
import Service.truckRegistarionService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String brand;

    public static void main(String[] args) throws IOException {
        VehicleRegisterService service = null;
        String flag;
        do {
            System.out.print("Enter vehicle type: ");
            String type = br.readLine();
            if (type.equalsIgnoreCase("Car")) {
                service = new carRegistertionService();
            } else if (type.equalsIgnoreCase("Truck")) {
                service = new truckRegistarionService();
            } else if (type.equalsIgnoreCase("MotorCycle")) {
                service = new CycleRegesterationService();
            }
            service.create();
            System.out.print("Do you want to add another: ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("Yes"));
        service.display();
    }
}
