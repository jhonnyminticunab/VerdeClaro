package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.verde_claro.verde.Collection.Persons;

public interface IPersonsRepository extends MongoRepository<Persons, String> {

}
