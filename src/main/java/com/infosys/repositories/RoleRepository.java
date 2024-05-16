package com.infosys.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infosys.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
	@Query("SELECT COUNT(e) FROM Role e WHERE e.roleId LIKE :prefix%")
    public int countByRoleIdPrefix(@Param("prefix") String prefix);
}
