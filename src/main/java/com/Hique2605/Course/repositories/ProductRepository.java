package com.Hique2605.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hique2605.Course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

