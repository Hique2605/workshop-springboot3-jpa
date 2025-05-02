package com.Hique2605.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hique2605.Course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}

