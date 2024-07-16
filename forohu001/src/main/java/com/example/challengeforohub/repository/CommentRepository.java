package com.example.challengeforohub.repository;


import com.example.challengeforohub.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
