package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

}
