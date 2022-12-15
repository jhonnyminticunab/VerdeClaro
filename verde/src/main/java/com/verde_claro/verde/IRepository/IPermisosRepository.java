package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.Permisos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPermisosRepository extends MongoRepository<Permisos, String> {
}
