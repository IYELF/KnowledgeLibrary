package com.pactera.knowledge.entity;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pactera.knowledge.KnowledgeLibraryApplicationTests;
import com.pactera.knowledge.repository.UserRepository;

public class UserRepositoryTest extends KnowledgeLibraryApplicationTests{

	@Autowired
	UserRepository userRepository;
	@Test
	public void testFindOne() {
		User user = userRepository.findOne(1);
		Assert.assertEquals("wali", user.getName());
	}
}
