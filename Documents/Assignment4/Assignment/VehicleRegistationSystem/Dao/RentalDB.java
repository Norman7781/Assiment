package Dao;

import Model.Rent;
import Model.Vehicle;

public class RentalDB {
    private static Rent[] rentalBB = new Rent[Vehicle.Max_Vehicle_count];

    public void create(Rent rent){
        rentalBB[rent.getRentCount()-1] = rent;
    }
    public void delte(Rent rent){
        if (rent == null) {
            System.out.println("Cannot delete a null.");
        }
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            if (rentalBB[i] != null && rentalBB[i].getRentalId() == rent.getRentalId()) {
                rentalBB[i] = null;
                System.out.println("Rental with ID " + rent.getRentalId() + " deleted.");
            }
        }
        System.out.println("Rental No not found");
    }
    public static Rent[] getAll(){
        return rentalBB;
    }

    public static Rent findById(int id){
        for(int i = 0; i < Rent.getRentCount(); i++){
            if (rentalBB[i].getRentalId() == id){
                return rentalBB[i];
            }
        }
        return null;
    }

}
