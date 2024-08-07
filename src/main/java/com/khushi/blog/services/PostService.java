package com.khushi.blog.services;

import java.util.List;

import com.khushi.blog.entities.Post;
import com.khushi.blog.payloads.PostDto;
import com.khushi.blog.payloads.PostResponse;

public interface PostService {

		// create
		PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
		
		// update
		PostDto updatePost(PostDto postDto, Integer postId);
		
		// delete
		void deletePost(Integer postId);
		
		// get all posts
		PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
		
		// get Single Post
		PostDto getPostById(Integer postId);
		
		// get all Posts by category
		List<PostDto> getPostsByCategory(Integer categoryId);
		
		// get all Posts by user
		List<PostDto> getPostsByUser(Integer userId);
		
		// search Post
		List<PostDto> searchPosts(String keyword);
}
