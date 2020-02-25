package com.cts.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.pojo.User;

public interface Userrepository extends  CrudRepository<User,Integer> {

}
