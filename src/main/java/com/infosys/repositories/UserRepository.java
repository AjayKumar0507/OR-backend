package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	public User getUserInfoByUserEmail(String userEmail);

	@Query("SELECT u FROM User u WHERE u.role.roleId = :roleId")
	public User getUserByRoleId(String roleId);


}
