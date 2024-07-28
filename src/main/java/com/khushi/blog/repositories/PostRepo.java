package com.khushi.blog.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.khushi.blog.entities.Category;
import com.khushi.blog.entities.Post;
import com.khushi.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
		
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
