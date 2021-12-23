package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
