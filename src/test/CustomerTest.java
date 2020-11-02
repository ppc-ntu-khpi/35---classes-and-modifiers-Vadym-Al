package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args){
        Customer customar = new Customer();
        customar.setID(15);
        customar.setNew(false);
        customar.setTotal(5000f);
        customar.displayCustomerInfo();
    }
}
