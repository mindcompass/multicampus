package com.compass.basic2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compass.basic2.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


//	List<Product> findByPriceGreaterThan(int price);

}
