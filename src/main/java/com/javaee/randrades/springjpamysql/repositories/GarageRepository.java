package com.javaee.randrades.springjpamysql.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaee.randrades.springjpamysql.domain.Garage;

@Repository
public interface GarageRepository extends CrudRepository<Garage, Long>{
}