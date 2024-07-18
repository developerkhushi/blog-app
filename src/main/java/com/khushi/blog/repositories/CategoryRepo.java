package com.khushi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khushi.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
