package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;

public interface Userrepositoryy 
				extends 
				JpaRepository<Users, Integer>{
	
	public Users findByEmail(String email);

}