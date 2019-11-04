package com.fsd.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fsd.sba.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("from User u where u.email=:name")
    User findByName(@Param("name") String name);

    @Query("from User u where u.id in :userIds and u.active = 1")
    List<User> getUsersByIds(@Param("userIds") List<Long> userIds);
}
