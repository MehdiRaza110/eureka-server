package com.comment.repository;

import com.comment.entity.CommentMe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentMe,Long> {
    List<CommentMe> findByUserId(long id);

}
