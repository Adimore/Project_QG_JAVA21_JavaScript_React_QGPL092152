package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.OrderDetails;
@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,Long> {

}
