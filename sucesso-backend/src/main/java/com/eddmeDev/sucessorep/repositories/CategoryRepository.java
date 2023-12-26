package com.eddmeDev.sucessorep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.sucessorep.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
