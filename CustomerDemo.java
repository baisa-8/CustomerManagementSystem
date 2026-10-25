package com.java.customer;

public class CustomerDemo {

    public static void main(String[] args) {

        CustomerOperations obj = new CustomerOperations();

        // Display all customers
        System.out.println("All Customers:");

        for (Customer c : obj.getCustomers()) {
            System.out.println(c);
        }

        // Add customer
        System.out.println("\nAdding Customer:");

        Customer c1 = new Customer(106, "Ananya", "Verma", 'F');

        if (obj.addCustomer(c1)) {
            System.out.println("Customer added successfully");
        } else {
            System.out.println("Customer already exists");
        }

        // Update customer
        System.out.println("\nUpdating Customer:");

        if (obj.updateCustomer(103, "Arjun", "Reddy", 'M')) {
            System.out.println("Customer updated successfully");
        } else {
            System.out.println("Customer not found");
        }

        // Delete customer
        System.out.println("\nDeleting Customer:");

        if (obj.deleteCustomer(104)) {
            System.out.println("Customer deleted successfully");
        } else {
            System.out.println("Customer not found");
        }

        // Search customer by ID
        System.out.println("\nSearching Customer by ID:");

        Customer c2 = obj.findCustomerById(102);

        if (c2 != null) {
            System.out.println(c2);
        } else {
            System.out.println("Customer not found");
        }

        // Search customer by first name
        System.out.println("\nSearching Customer by First Name:");

        Customer c3 = obj.findCustomerByFirstname("Kiran");

        if (c3 != null) {
            System.out.println(c3);
        } else {
            System.out.println("Customer not found");
        }

        // Display final customer list
        System.out.println("\nFinal Customer List:");

        for (Customer c : obj.getCustomers()) {
            System.out.println(c);
        }
    }
}
