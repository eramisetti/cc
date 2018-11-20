package com.cc.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cc.data.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
