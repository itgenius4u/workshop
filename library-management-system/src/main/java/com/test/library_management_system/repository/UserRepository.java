package com.test.library_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.library_management_system.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
