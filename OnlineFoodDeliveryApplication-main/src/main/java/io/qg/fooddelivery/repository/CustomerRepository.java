package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
