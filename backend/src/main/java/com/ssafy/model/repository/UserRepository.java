package com.ssafy.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.model.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserId(String userId);
}
