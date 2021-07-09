package com.bachngo.socialmediaprj.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * used to display posts 
 * @author Bach
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PostResponse {
	
	private Long postId;
	private String content;
	private String createdAt;
	private Long likeCount;
	private Long dislikeCount;
	private String userFirstName;
	private String userLastName;
	private int commentCount;
	private String userReact;
	
}
