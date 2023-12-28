package com.eddmeDev.sucessorep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.sucessorep.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
