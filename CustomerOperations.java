package com.java.customer;
import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {

    private HashSet<Customer> customers = new HashSet<Customer>();

    public CustomerOperations() {

        customers.add(new Customer(101, "Rahul", "Sharma", 'M'));
        customers.add(new Customer(102, "Priya", "Reddy", 'F'));
        customers.add(new Customer(103, "Arjun", "Kumar", 'M'));
        customers.add(new Customer(104, "Sneha", "Rao", 'F'));
        customers.add(new Customer(105, "Kiran", "Patel", 'M'));
    }

    // Add customer
    public boolean addCustomer(Customer c) {
        return customers.add(c);
    }

    // Update customer
    public boolean updateCustomer(int id, String firstname,
                                  String lastname, char gender) {

        for (Customer c : customers) {
            if (c.getId() == id) {
                c.setFirstname(firstname);
                c.setLastname(lastname);
                c.setGender(gender);
                return true;
            }
        }

        return false;
    }

    // Delete customer
    public boolean deleteCustomer(int id) {

        Iterator<Customer> it = customers.iterator();

        while (it.hasNext()) {
            Customer c = it.next();

            if (c.getId() == id) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    // Get all customers
    public HashSet<Customer> getCustomers() {
        return customers;
    }

    // Search customer by ID
    public Customer findCustomerById(int id) {

        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    // Search customer by first name
    public Customer findCustomerByFirstname(String firstname) {

        for (Customer c : customers) {
            if (c.getFirstname().equalsIgnoreCase(firstname)) {
                return c;
            }
        }

        return null;
    }
}
