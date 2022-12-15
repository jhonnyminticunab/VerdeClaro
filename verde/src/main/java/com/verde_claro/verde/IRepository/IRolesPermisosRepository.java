package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.RolesPermisos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRolesPermisosRepository extends MongoRepository<RolesPermisos, String> {
}
