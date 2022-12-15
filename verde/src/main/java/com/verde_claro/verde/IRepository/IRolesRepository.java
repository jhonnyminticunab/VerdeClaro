package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRolesRepository extends MongoRepository<Roles, String> {
}
