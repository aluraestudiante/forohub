package com.example.challengeforohub.repository;


import com.example.challengeforohub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
