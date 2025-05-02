package com.Hique2605.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hique2605.Course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

