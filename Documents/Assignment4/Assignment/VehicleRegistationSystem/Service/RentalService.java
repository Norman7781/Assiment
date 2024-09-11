package Service;

import Dao.CustomerDB;
import Dao.RentalDB;
import Dao.VehicleDB;
import Model.Rent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalService extends AbstractRental{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Rent rent;
    private RentalDB rentalDB;
    private CustomerDB customerDB;
    private VehicleDB vehicleDB;

    @Override
    public void getCommonInfo() throws IOException{
        System.out.println("Enter Customer id:  ");
        int customerId = Integer.parseInt(br.readLine());
        System.out.print("Enter Vehicle id: ");
        int vehicleId = Integer.parseInt(br.readLine());
        System.out.print("Enter Rental Days");
        int rentDay = Integer.parseInt(br.readLine());
        rent = new Rent(customerDB.findById(customerId), vehicleDB.findById(vehicleId), rentDay);
    }
    public void createRental() throws IOException {
        getCommonInfo();
        rentalDB.create(rent);
    }

}
