package com.tajutechgh.unitconversion.api.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader implements CommandLineRunner {

	@Autowired 
	UserRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User("admin", "$2a$10$0GFggDfgnEgJAMJjve0j/.EBxRzXJQRyMN9EAu7582Zz7PVsehTDG");	// pass: nimda
		User user2 = new User("namhm", "$2a$10$jKav7lIDc1MQqSJLFss61uf2lovhMK5ngJXEGXyPyG2GUKyOvXGeW");	// pass: codejava
		User user3 = new User("john", "$2a$10$jdtALbGpyXaTWzxC1ur5FuOSIPdZknsri2zKKomwueqmnbZSyJBJW");	// pass: doedoe
		
		repo.saveAll(List.of(user1, user2, user3));
		
		System.out.println("Loaded sample user data");
	}

}