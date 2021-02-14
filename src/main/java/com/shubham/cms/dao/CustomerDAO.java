package com.shubham.cms.dao;

import com.shubham.cms.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects.
@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> { // <Model, Primary Key Type>

    @Override // Overriding the existing method
    List<Customer> findAll();
}
