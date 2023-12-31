package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Caminha", "caminhamamaedobebe@gmail.com", "99999999", "12345678");
		User u2 = new User("Patriko", "patrikobebedamamae@gmail.com", "99999999", "12345678");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
