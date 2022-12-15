package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.RolesUsuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRolesUsuariosRepository extends MongoRepository<RolesUsuarios, String> {
}
