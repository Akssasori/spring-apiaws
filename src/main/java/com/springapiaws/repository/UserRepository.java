package com.springapiaws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springapiaws.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM user u WHERE email = ?1 AND password = ?2")
	public Optional<User> login(String email, String password);
	
	
//	public List<Request> findAllOwnerId(Long id);
//	
//	@Query("UPDATE request SET state = ?2 WHERE id = ?1")
//	public Request updateStatus(Long id, RequestState state);

}
