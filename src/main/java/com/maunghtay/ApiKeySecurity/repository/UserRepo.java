package com.maunghtay.ApiKeySecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maunghtay.ApiKeySecurity.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	@Query(value = "select * from users",nativeQuery = true)
	List<User> getAllUser();

}
