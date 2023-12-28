package com.eddmeDev.sucessorep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.sucessorep.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
