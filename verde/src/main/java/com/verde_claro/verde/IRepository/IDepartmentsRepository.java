package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.verde_claro.verde.Collection.Departments;

public interface IDepartmentsRepository extends MongoRepository<Departments, String> {

}
