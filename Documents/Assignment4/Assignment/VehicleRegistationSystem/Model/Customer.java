package Model;

public class Customer {
    private String name;
    private String address;
    private int id;
    private static int customerCount=0;
    public Customer(String name , String address, int id){
        this.name = name;
        this.address = address;
        this.id = id;
        customerCount++;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public static void setCustomerCount(int customerCount) {
        Customer.customerCount = customerCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
