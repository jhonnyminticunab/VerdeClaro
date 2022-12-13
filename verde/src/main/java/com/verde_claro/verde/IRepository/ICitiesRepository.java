package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.verde_claro.verde.Collection.Cities;

public interface ICitiesRepository extends MongoRepository<Cities, String> {

}
