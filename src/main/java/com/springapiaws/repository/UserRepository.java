package com.springapiaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapiaws.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
