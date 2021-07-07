package com.bachngo.socialmediaprj.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name="friend_connection")
public class FriendConnection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="requestder_id", referencedColumnName = "id")
	private AppUser requestder;
	
	@ManyToOne
	@JoinColumn(name="requestdee_id", referencedColumnName = "id")
	private AppUser requestdee;
	
	private boolean accepted = false; 
}
