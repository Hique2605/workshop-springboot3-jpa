package com.Hique2605.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hique2605.Course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

