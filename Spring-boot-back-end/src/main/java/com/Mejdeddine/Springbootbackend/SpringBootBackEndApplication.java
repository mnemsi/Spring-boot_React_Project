package com.Mejdeddine.Springbootbackend;

import com.Mejdeddine.Springbootbackend.model.User;
import com.Mejdeddine.Springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackEndApplication.class, args);
	}


	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Mejdeddine", "Nemsi", "majdeddine.nemsi@gmail.com"));
		userRepository.save(new User("Rania", "harrabi", "rania.harrabi@gmail.com"));
		userRepository.save(new User("ella", "Nemsi", "ella.nemsi@gmail.com"));
	}
}
