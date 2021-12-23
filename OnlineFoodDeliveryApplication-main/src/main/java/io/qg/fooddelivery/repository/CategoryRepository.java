package io.qg.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.qg.fooddelivery.models.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
