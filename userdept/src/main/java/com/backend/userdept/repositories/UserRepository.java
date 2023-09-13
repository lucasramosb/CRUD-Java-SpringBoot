package com.backend.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
