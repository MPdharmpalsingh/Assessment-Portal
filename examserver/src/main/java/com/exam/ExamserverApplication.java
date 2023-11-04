package com.exam;

import com.exam.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
        System.out.print("hi dharmpal singh");
        User user=new User();
        user.setFirstName("dharmpal");
		user.setLastName("singh");
		user.setUsername("dps33261");
		user.setPassword("123");
		user.setEmail("dps33261@gmail.com");
		user.setProfile("default.png");




	}

}
