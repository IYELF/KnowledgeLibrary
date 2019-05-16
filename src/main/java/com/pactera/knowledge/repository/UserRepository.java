package com.pactera.knowledge.repository;

import org.springframework.data.repository.CrudRepository;

import com.pactera.knowledge.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByName(String name);
}
