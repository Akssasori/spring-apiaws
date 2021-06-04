//package com.springapiaws.repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.FixMethodOrder;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.springapiaws.domain.User;
//import com.springapiaws.domain.enums.Role;
//
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@SpringBootTest
//public class UserRepositoryTests {
//	
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Test
//	public void saveTest() {
//		User user = new User(null, "Lucas", "diniz3003@gmail.com", "123", Role.ADMINISTRATOR, null, null);
//		User createdUser = userRepository.save(user);
//		//
//		assertThat(createdUser.equals(user));
//		
//	}
//	
//	public void updateTest() {
//		User user = new User(1L, "Lucas", "diniz3003@gmail.com", "123", Role.ADMINISTRATOR, null, null);
//		User updatedUser = userRepository.save(user);
//		
//		assertThat(updatedUser.)
//		
//	}
//	
//	public void getByIdTest() {
//		
//	}
//	
//	public void listTest() {
//		
//	}
//	
//	public void loginTeste() {
//		
//	}
//
//}
