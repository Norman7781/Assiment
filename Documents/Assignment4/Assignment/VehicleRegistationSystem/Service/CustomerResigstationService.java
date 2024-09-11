package Service;

import Dao.CustomerDB;
import Model.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerResigstationService extends AbstractRental {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Customer customer;
    public CustomerDB customerDao;

    @Override
    public void getCommonInfo() throws IOException {
        System.out.print("Enter Customer name: ");
        String name = br.readLine();
        System.out.print("Enter Customer id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.print("Enter Customer adress: ");
        String address = br.readLine();
        customer = new Customer(name,address,id);
    }

    public void createCustomer() throws IOException {
        getCommonInfo();
        customerDao.create(customer);
    }
    
}

