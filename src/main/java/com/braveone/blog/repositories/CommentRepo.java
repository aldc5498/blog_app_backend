package com.braveone.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braveone.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
