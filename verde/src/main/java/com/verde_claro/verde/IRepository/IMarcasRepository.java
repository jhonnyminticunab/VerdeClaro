package com.verde_claro.verde.IRepository;

import com.verde_claro.verde.Collection.Marcas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMarcasRepository extends MongoRepository<Marcas, String> {
}
