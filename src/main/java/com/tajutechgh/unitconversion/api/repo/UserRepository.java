package com.tajutechgh.unitconversion.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
}