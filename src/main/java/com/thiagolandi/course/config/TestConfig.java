package com.thiagolandi.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.thiagolandi.course.entities.User;
import com.thiagolandi.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		//saveAll é um metodo do JpaRepositoy que foi usado na inteface UserRepository
		//Array.asList foi usado para nao ter que fazer a instanciação duas vezes, um pra cada objeto criado
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
