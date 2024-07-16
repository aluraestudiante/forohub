package com.example.challengeforohub.repository;

import com.example.challengeforohub.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}