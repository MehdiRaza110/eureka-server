package com.comment.repository;

import com.comment.entity.CommentMe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentMe,Long> {
}
