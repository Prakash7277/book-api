package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String  birth;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	@Column
	private String gender;
	
	@Column
	private String password;
	
	@Column
	private String address;
	
	
}
