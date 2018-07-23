package com.suren.jpa.springbootjpahibernate.repository;

import com.suren.jpa.springbootjpahibernate.resource.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
