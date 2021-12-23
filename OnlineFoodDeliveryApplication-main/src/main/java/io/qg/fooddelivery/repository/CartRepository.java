package io.qg.fooddelivery.repository;

import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.FoodCart;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CartRepository extends JpaRepository<FoodCart,Long>{

}
