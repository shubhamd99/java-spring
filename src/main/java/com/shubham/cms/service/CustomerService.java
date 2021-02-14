// The service layer is there to provide logic to operate on the data sent to and from the DAO (Data Access Object) and the client.

package com.shubham.cms.service;

import com.shubham.cms.dao.CustomerDAO;
import com.shubham.cms.exception.CustomerNotFoundException;
import com.shubham.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

// Spring Component annotation (@Component) is used to denote a class as Component.
//  It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and
// classpath scanning is used.
@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO; // Data Access Object

    private int customerIdCount = 1;
    // We used CopyOnWriteArrayList instead of ArrayList because it's good for concurrent operations
    // A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented,
    // by making a fresh copy of the underlying array.
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        // Local Array Operations
        // customer.setCustomerId(customerIdCount);
        // customerList.add(customer);
        // customerIdCount++;
        // return customer;

        // DB Operations
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        // Local Array Operations
        // return customerList;

        // DB Operations
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
        // Local Array Operations
        // return customerList
        //        .stream()
        //        .filter(c -> c.getCustomerId() == customerId)
        //        .findFirst()
        //        .get();

        // DB Operations
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if (!optionalCustomer.isPresent()) {
            throw new CustomerNotFoundException("Customer Record is not available...");
        }
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        // Local Array Operations
       /* customerList
                .forEach(c -> {
                    if (c.getCustomerId() == customerId) {
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();*/

        // DB Operations
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {
        // Local Array Operations
        /* customerList
                .forEach(c -> {
                    if (c.getCustomerId() == customerId) {
                        customerList.remove(c);
                    }
                });*/

        // DB Operations
        customerDAO.deleteById(customerId);
    }
}
