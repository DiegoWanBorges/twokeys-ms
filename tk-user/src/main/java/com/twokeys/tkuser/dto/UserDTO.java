package com.twokeys.tkuser.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.twokeys.tkuser.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private List<RoleDTO> roles = new ArrayList<>();
	
	public UserDTO() {
		
	}
		
	public UserDTO(Long id, String name,
				   String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;

	}


	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		entity.getRoles().forEach(rol -> this.roles.add(new RoleDTO(rol)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
	public List<RoleDTO> getRoles() {
		return roles;
	}
		
}
