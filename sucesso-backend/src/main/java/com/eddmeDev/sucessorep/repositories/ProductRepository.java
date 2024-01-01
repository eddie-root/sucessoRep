package com.eddmeDev.sucessorep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.sucessorep.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
