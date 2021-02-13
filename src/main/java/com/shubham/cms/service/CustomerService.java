// The service layer is there to provide logic to operate on the data sent to and from the DAO (Data Access Object) and the client.

package com.shubham.cms.service;

import com.shubham.cms.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Spring Component annotation (@Component) is used to denote a class as Component.
//  It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and
// classpath scanning is used.
@Component
public class CustomerService {

    private int customerIdCount = 1;
    // We used CopyOnWriteArrayList instead of ArrayList because it's good for concurrent operations
    // A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented,
    // by making a fresh copy of the underlying array.
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;

        return customer;
    }

    public List<Customer> getCustomers() {
        return customerList;
    }

    public Customer getCustomer(int customerId) {
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customerList
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
                .get();
    }

    public void deleteCustomer(int customerId) {
        customerList
                .forEach(c -> {
                    if (c.getCustomerId() == customerId) {
                        customerList.remove(c);
                    }
                });
    }
}
