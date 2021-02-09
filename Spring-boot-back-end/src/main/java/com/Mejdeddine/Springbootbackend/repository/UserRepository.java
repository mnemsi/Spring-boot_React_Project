package com.Mejdeddine.Springbootbackend.repository;

import com.Mejdeddine.Springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
