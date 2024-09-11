package Dao;

import Model.Vehicle;

public class VehicleDB {
    public static Vehicle[] vehicleDB = new Vehicle[Vehicle.Max_Vehicle_count];
    public static Vehicle[] vehicles = new Vehicle[100];

    public static Vehicle[] getVehicles() {
        return vehicles;
    }

    public static void setVehicles(Vehicle[] vehicles) {
        VehicleDB.vehicles = vehicles;
    }

    public void create(Vehicle vehicle) {
        vehicleDB[Vehicle.getVehicleCount() - 1] = vehicle;
    }

    public void delete(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Cannot delete a null vehicle.");
        }
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            if (vehicleDB[i] != null && vehicleDB[i].getId() == vehicle.getId()) {
                vehicleDB[i] = null;
                System.out.println("Vehicle with ID " + vehicle.getId() + " deleted.");
            }
        }
        System.out.println("Vehicle not found");
    }

    public void update(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Cannot update a null vehicle.");
        }
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            if (vehicleDB[i] != null && vehicleDB[i].getId() == vehicle.getId()) {
                vehicleDB[i] = vehicle;
                System.out.println("Vehicle with ID " + vehicle.getId() + " updated.");
            }
        }
        System.out.println("Vehicle not found.");
    }

    public Vehicle[] getAll() {
        return vehicleDB;
    }

    public Vehicle findById(int id) {
        for (int i = 0; i < Vehicle.getVehicleCount(); i++) {
            if (vehicleDB[i].getId() == id) {
                return vehicleDB[i];
            }
        }
        return null;
    }
}
