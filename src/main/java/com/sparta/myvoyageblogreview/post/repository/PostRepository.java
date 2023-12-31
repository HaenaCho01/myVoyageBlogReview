package com.sparta.myvoyageblogreview.post.repository;

import com.sparta.myvoyageblogreview.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findAllByOrderByCreatedAtDesc();
}
