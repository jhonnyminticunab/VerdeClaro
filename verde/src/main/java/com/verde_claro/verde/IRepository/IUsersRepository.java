package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.verde_claro.verde.Collection.Users;

public interface IUsersRepository extends MongoRepository<Users, String> {

}
