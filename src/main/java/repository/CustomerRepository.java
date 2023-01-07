package repository;

import org.springframework.data.repository.CrudRepository;

import entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Customer findByCustomerId(Long customerId);
}