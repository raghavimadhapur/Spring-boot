package com.weather.ActifyData.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.ActifyData.entity.RegisterEntity;

@Repository
public interface RegisterRepository extends CrudRepository<RegisterEntity, String> {
	RegisterEntity findByEmailAndPassword(String email, String password);

}
