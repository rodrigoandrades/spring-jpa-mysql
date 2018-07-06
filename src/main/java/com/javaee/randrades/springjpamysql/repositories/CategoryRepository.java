package com.javaee.randrades.springjpamysql.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaee.randrades.springjpamysql.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
}