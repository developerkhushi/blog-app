package com.khushi.blog.payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {
	private String message;
	private boolean success;
}
