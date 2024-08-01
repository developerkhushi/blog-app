package com.khushi.blog.services;

import com.khushi.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	void deleteComment(Integer commentId);
}
