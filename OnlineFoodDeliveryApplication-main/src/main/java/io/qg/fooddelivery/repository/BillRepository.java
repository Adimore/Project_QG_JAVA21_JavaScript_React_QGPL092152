package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {

}
