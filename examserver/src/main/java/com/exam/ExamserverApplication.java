package com.exam;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
//import java.util.HashSet;

@SpringBootApplication
public class ExamserverApplication implements  CommandLineRunner{
	@Autowired
	private UserServices userServices;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("hi dharmpal singh");
		User user=new User();
		user.setFirstName("Aram");
		user.setLastName("singh");
		user.setUsername("Ad361");
		user.setPassword("123");
		user.setEmail("Ad332@gmail.com");
		user.setProfile("Adefault.png");

		Role role1=new Role();
		role1.setRoleId(165L);
		role1.setRoleName("ADMIN");
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		User user1=this.userServices.createUser(user,userRoleSet);
		System.out.println(user1.getUsername());

	}
}



//package com.exam;
//
//import com.exam.model.Role;
//import com.exam.model.User;
//import com.exam.model.UserRole;
//import com.exam.service.UserServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@SpringBootApplication
//public class ExamserverApplication implements CommandLineRunner {
//	@Autowired
//	private UserServices userServices;
//
//	public static void main(String[] args) {
//		SpringApplication.run(ExamserverApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("starting code");
//		User user=new User();
//		user.setFirstName("RAMU");
//		user.setLastName("singh");
//		user.setUsername("2dps33261");
//		user.setPassword("123");
//		user.setEmail("dp2s33261@gmail.com");
//		user.setProfile("default.png");
//		Role role1 =new Role();
//		role1.setRoleId(65L);
//		role1.setRoleName("Admin");
//
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1=this.userServices.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
//
//	}
//}
