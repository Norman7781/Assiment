package Dao;

import Model.Customer;
import Model.Vehicle;

public class CustomerDB {
    public static Customer[] customerDB = new Customer[Vehicle.Max_Vehicle_count];

    public void create(Customer customer){
        customerDB[Customer.getCustomerCount() - 1] = customer;
    }
    public Customer findById(int id){
        return null;
    }
    public Customer[] getAll(){
        return customerDB;
    }
}
